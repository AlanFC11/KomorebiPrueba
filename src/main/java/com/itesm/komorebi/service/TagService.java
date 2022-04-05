package com.itesm.komorebi.service;

import com.itesm.komorebi.models.Persona;
import com.itesm.komorebi.models.Tag;
import com.itesm.komorebi.repositories.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagService {
    @Autowired
    TagRepository tagRepository;
    public List<Tag> getAll(){
        return tagRepository.findAll();
    }
    public Tag getById(int id){
        return tagRepository.findById(id);
    }
    public Tag updateName(int id, String newName){return tagRepository.updateName(id, newName);}
}
