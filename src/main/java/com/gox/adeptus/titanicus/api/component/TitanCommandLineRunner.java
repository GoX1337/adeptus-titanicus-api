package com.gox.adeptus.titanicus.api.component;

import com.gox.adeptus.titanicus.api.entity.Titan;
import com.gox.adeptus.titanicus.api.repository.TitanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TitanCommandLineRunner implements CommandLineRunner {

    @Autowired
    private TitanRepository titanRepository;

    @Override
    public void run(String... args) throws Exception {
        Titan t1 = new Titan("Warlord Sinister", 685);
        Titan t2 = new Titan("Warlord", 385);
        Titan t3 = new Titan("Warlord Nemesis", 325);
        Titan t4 = new Titan("Reaver", 250);
        Titan t5 = new Titan("Warhound", 180);
        titanRepository.save(t1);
        titanRepository.save(t2);
        titanRepository.save(t3);
        titanRepository.save(t4);
        titanRepository.save(t5);
    }
}