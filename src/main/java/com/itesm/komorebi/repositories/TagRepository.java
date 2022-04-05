package com.itesm.komorebi.repositories;

import com.itesm.komorebi.models.Staff;
import com.itesm.komorebi.models.Tag;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TagRepository {
    public List<Tag> findAll(){
        Tag t1 = new Tag();
        t1.setName("Quality lost");
        t1.setTagID(4);
        t1.setCategory("Quality");
        Tag t2 = new Tag();
        t2.setName("System failure");
        t2.setTagID(2);
        t2.setCategory("Errors");
        List<Tag> result = new ArrayList<>();
        result.add(t1);
        result.add(t2);
        return result;
    }
    public Tag findById(int id){
        Tag t1 = new Tag();
        t1.setName("Agent behaviour");
        t1.setTagID(5);
        t1.setCategory("Agent");
        return t1;
    }
    public Tag updateName(int id, String newName){
        Tag t1 = new Tag();
        t1.setCategory("Conexión");
        t1.setTagID(1);
        t1.setName("Error de conexión");
        Tag t2 = new Tag();
        t2.setCategory("Mensajes");
        t2.setTagID(2);
        t2.setName("Mensaje de error");
        List<Tag> result = new ArrayList<>();
        result.add(t1);
        result.add(t2);
        for (int i = 0; i< result.size() ; i++){
            if (result.get(i).getTagID() == id ){
                result.get(i).setName(newName);
                return result.get(i);
            }
        }
        return t1;
    }
}
