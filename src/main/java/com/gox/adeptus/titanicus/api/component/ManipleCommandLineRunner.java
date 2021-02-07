package com.gox.adeptus.titanicus.api.component;

import com.gox.adeptus.titanicus.api.entity.Banner;
import com.gox.adeptus.titanicus.api.entity.Maniple;
import com.gox.adeptus.titanicus.api.repository.BannerRepository;
import com.gox.adeptus.titanicus.api.repository.ManipleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ManipleCommandLineRunner implements CommandLineRunner {

    @Autowired
    private ManipleRepository manipleRepository;

    @Override
    public void run(String... args) throws Exception {
        Maniple m1 = new Maniple("Audax Canis Light", 540);
        Maniple m2 = new Maniple("Arcus Battleline", 685);
        Maniple m3 = new Maniple("Axiom Battleline", 815);
        Maniple m4 = new Maniple("Corsair Battleline", 750);
        Maniple m5 = new Maniple("Dominus Battleforce", 885);
        Maniple m6 = new Maniple("Ferrox Light", 610);
        Maniple m7 = new Maniple("Fortis Battle", 885);
        Maniple m8 = new Maniple("Janissary Battleline", 610);
        Maniple m9 = new Maniple("Lupercal Light", 540);
        Maniple m10 = new Maniple("Mandatum Battleline", 745);
        Maniple m11 = new Maniple("Myrmidon Battleline", 1020);
        Maniple m12 = new Maniple("Regia Battleline", 950);
        Maniple m13 = new Maniple("Ruptura Battleline", 900);
        Maniple m14 = new Maniple("Venator Light", 610);

        manipleRepository.save(m1);
        manipleRepository.save(m2);
        manipleRepository.save(m3);
        manipleRepository.save(m4);
        manipleRepository.save(m5);
        manipleRepository.save(m6);
        manipleRepository.save(m7);
        manipleRepository.save(m8);
        manipleRepository.save(m9);
        manipleRepository.save(m10);
        manipleRepository.save(m11);
        manipleRepository.save(m12);
        manipleRepository.save(m13);
        manipleRepository.save(m14);
    }
}