package com.itesm.komorebi.controllers;

import com.itesm.komorebi.models.Persona;
import com.itesm.komorebi.models.RecConfiguration;
import com.itesm.komorebi.service.RecConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/RecConfig")

public class RecConfigurationController {
    @Autowired
    RecConfigurationService recConfigurationService;

    @GetMapping("/Configuration")
    public RecConfiguration getRecConfig(){
        RecConfiguration rc = new RecConfiguration();
        rc.setEncryption(true);
        rc.setAllowSharing(true);
        rc.setMaxDuration(180);
        rc.setResolution(1920);
        rc.setMinDuration(15);
        return rc;
    }
    @PostMapping("/new")
    public RecConfiguration newConfig(@RequestBody RecConfiguration recConfiguration){
        System.out.println(recConfiguration.getMaxDuration());
        System.out.println(recConfiguration.getMinDuration());
        System.out.println(recConfiguration.getResolution());
        return recConfiguration;
    }
    @GetMapping("/todos")
    public RecConfiguration obtenerTodos(){
        return recConfigurationService.getConfig();
    }
}
