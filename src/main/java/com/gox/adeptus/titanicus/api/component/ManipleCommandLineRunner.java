package com.gox.adeptus.titanicus.api.component;

import com.gox.adeptus.titanicus.api.entity.ManiplePattern;
import com.gox.adeptus.titanicus.api.repository.ManiplePatternRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ManipleCommandLineRunner implements CommandLineRunner {

    @Autowired
    private ManiplePatternRepository maniplePatternRepository;

    @Override
    public void run(String... args) throws Exception {
        ManiplePattern m1 = new ManiplePattern("Audax Canis Light", 540);
        ManiplePattern m2 = new ManiplePattern("Arcus Battleline", 685);
        ManiplePattern m3 = new ManiplePattern("Axiom Battleline", 815);
        ManiplePattern m4 = new ManiplePattern("Corsair Battleline", 750);
        ManiplePattern m5 = new ManiplePattern("Dominus Battleforce", 885);
        ManiplePattern m6 = new ManiplePattern("Ferrox Light", 610);
        ManiplePattern m7 = new ManiplePattern("Fortis Battle", 885);
        ManiplePattern m8 = new ManiplePattern("Janissary Battleline", 610);
        ManiplePattern m9 = new ManiplePattern("Lupercal Light", 540);
        ManiplePattern m10 = new ManiplePattern("Mandatum Battleline", 745);
        ManiplePattern m11 = new ManiplePattern("Myrmidon Battleline", 1020);
        ManiplePattern m12 = new ManiplePattern("Regia Battleline", 950);
        ManiplePattern m13 = new ManiplePattern("Ruptura Battleline", 900);
        ManiplePattern m14 = new ManiplePattern("Venator Light", 610);

        maniplePatternRepository.save(m1);
        maniplePatternRepository.save(m2);
        maniplePatternRepository.save(m3);
        maniplePatternRepository.save(m4);
        maniplePatternRepository.save(m5);
        maniplePatternRepository.save(m6);
        maniplePatternRepository.save(m7);
        maniplePatternRepository.save(m8);
        maniplePatternRepository.save(m9);
        maniplePatternRepository.save(m10);
        maniplePatternRepository.save(m11);
        maniplePatternRepository.save(m12);
        maniplePatternRepository.save(m13);
        maniplePatternRepository.save(m14);
    }
}