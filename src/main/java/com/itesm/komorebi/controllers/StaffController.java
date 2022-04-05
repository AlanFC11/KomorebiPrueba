package com.itesm.komorebi.controllers;

import com.itesm.komorebi.models.Persona;
import com.itesm.komorebi.models.RecConfiguration;
import com.itesm.komorebi.models.Staff;
import com.itesm.komorebi.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/Staff")

public class StaffController {
    @Autowired
    StaffService staffService;

    @GetMapping("/Staff")
    public Staff getStaff(){
        Staff s = new Staff();
        s.setActive(true);
        s.setEmail("julia@gmail.com");
        s.setStaff_id(1);
        s.setExternalID("1");
        s.setName("Julia");
        s.setLastName("Moretti");
        return s;
    }
    @PostMapping("/new")
    public Staff newStaff(@RequestBody Staff staff){
        System.out.println(staff.getEmail());
        System.out.println(staff.getLastName());
        System.out.println(staff.getName());
        System.out.println(staff.getRole());
        return staff;
    }
    @GetMapping("/update/{id}/{lastName}")
    public Staff updateLastName(@PathVariable("ïd") int id, @PathVariable("lastName") String lastName)
    {return staffService.updateLastName(id, lastName);}
    @GetMapping("/todos")
    public List<Staff> obtenerTodos(){
        return staffService.getAll();
    }
    @GetMapping("/obtener/{id}")
    public Staff findById(@PathVariable("id") int id){
        return staffService.getById(id);
    }
}
