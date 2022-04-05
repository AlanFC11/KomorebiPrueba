package com.itesm.komorebi.repositories;

import com.itesm.komorebi.models.Persona;
import com.itesm.komorebi.models.Staff;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StaffRepository {
    public List<Staff> findAll(){
        Staff s1 = new Staff();
        s1.setLastName("Solorio");
        s1.setName("Juana");
        s1.setStaff_id(4);
        s1.setExternalID("AG_1");
        s1.setEmail("alca@outlook.com");
        s1.setActive(false);
        Staff s2 = new Staff();
        s2.setLastName("Olorio");
        s2.setName("Juan");
        s2.setStaff_id(5);
        s2.setExternalID("AG_2");
        s2.setEmail("afga@outlook.com");
        s2.setActive(true);
        List<Staff> result = new ArrayList<>();
        result.add(s1);
        result.add(s2);
        return result;
    }
    public Staff findById(int id){
        Staff s1= new Staff();
        s1.setLastName("So");
        s1.setName("Max");
        s1.setStaff_id(1);
        s1.setExternalID("AG_0");
        s1.setEmail("maxso@outlook.com");
        s1.setActive(false);
        return s1;
    }

    public Staff updateLastName(int id, String newLast){
        Staff s1= new Staff();
        s1.setLastName("Morales");
        s1.setName("Máximo");
        s1.setStaff_id(1);
        s1.setExternalID("AG_0");
        s1.setEmail("maximo@outlook.com");
        s1.setActive(false);
        Staff s2 = new Staff();

        s2.setLastName("Olorio");
        s2.setName("Juan");
        s2.setStaff_id(5);
        s2.setExternalID("AG_2");
        s2.setEmail("afga@outlook.com");
        s2.setActive(true);

        List<Staff> result = new ArrayList<>();
        result.add(s1);
        result.add(s2);
        for (int i = 0; i< result.size() ; i++){
            if (result.get(i).getStaff_id() == id ){
                result.get(i).setLastName(newLast);
                return result.get(i);
            }
        }
        return s1;
    }
}
