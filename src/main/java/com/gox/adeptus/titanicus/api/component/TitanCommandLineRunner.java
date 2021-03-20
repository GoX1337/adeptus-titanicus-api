package com.gox.adeptus.titanicus.api.component;

import com.gox.adeptus.titanicus.api.entity.TitanPattern;
import com.gox.adeptus.titanicus.api.repository.TitanPatternRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TitanCommandLineRunner implements CommandLineRunner {

    @Autowired
    private TitanPatternRepository titanPatternRepository;

    @Override
    public void run(String... args) throws Exception {
        TitanPattern t1 = new TitanPattern("Warlord Sinister", 685);
        TitanPattern t2 = new TitanPattern("Warlord", 385);
        TitanPattern t3 = new TitanPattern("Warlord Nemesis", 325);
        TitanPattern t4 = new TitanPattern("Reaver", 250);
        TitanPattern t5 = new TitanPattern("Warhound", 180);
        titanPatternRepository.save(t1);
        titanPatternRepository.save(t2);
        titanPatternRepository.save(t3);
        titanPatternRepository.save(t4);
        titanPatternRepository.save(t5);
    }
}