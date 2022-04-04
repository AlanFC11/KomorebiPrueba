package com.itesm.komorebi.service;

import com.itesm.komorebi.models.Persona;
import com.itesm.komorebi.models.Staff;
import com.itesm.komorebi.repositories.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {
    @Autowired
    StaffRepository staffRepository;
    public List<Staff> getAll(){
        return staffRepository.findAll();
    }
    public Staff getById(int id){
        return staffRepository.findById(id);
    }
}
