package com.itesm.komorebi.repositories;

import com.itesm.komorebi.models.RecConfiguration;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RecConfigurationRepository {
    public RecConfiguration find(){
        RecConfiguration rc1 = new RecConfiguration();
        rc1.setMinDuration(0);
        rc1.setResolution(720);
        rc1.setMaxDuration(800);
        rc1.setAllowSharing(true);
        rc1.setEncryption(true);
        return rc1;
    }
    public RecConfiguration updateMaxDuration(int maxDur){
        RecConfiguration rc1 = new RecConfiguration();
        rc1.setMinDuration(0);
        rc1.setResolution(720);
        rc1.setMaxDuration(800);
        rc1.setAllowSharing(true);
        rc1.setEncryption(true);

        rc1.setMaxDuration(maxDur);
        return rc1;
    }
}
