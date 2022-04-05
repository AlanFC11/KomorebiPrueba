package com.itesm.komorebi.controllers;

import com.itesm.komorebi.models.Staff;
import com.itesm.komorebi.models.Tag;
import com.itesm.komorebi.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/Tag")

public class TagController {
    @Autowired
    TagService tagService;

    @GetMapping
    public Tag getTag(){
        Tag t = new Tag();
        t.setTagID(1);
        t.setCategory("WifiConnection");
        t.setName("connection");
        return t;
    }
    @PostMapping("/new")
    public Tag newtag(@RequestBody Tag tag){
        System.out.println(tag.getCategory());
        System.out.println(tag.getName());
        return tag;
    }
    @GetMapping("/update/{id}/{name}")
    public Tag updateName(@PathVariable("ïd") int id, @PathVariable("name") String name)
    {return tagService.updateName(id, name);}

    @GetMapping("/todos")
    public List<Tag> obtenerTodos(){
        return tagService.getAll();
    }
    @GetMapping("/obtener/{id}")
    public Tag findById(@PathVariable("id") int id){
        return tagService.getById(id);
    }
}
