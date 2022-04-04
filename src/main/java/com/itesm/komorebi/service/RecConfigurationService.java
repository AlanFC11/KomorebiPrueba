package com.itesm.komorebi.service;

import com.itesm.komorebi.models.Persona;
import com.itesm.komorebi.models.RecConfiguration;
import com.itesm.komorebi.repositories.RecConfigurationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecConfigurationService {
    @Autowired
    RecConfigurationRepository recConfigurationRepository;
    public RecConfiguration getConfig(){
        return recConfigurationRepository.find();
    }
}
