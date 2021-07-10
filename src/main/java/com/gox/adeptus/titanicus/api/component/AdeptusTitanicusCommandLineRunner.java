package com.gox.adeptus.titanicus.api.component;

import com.gox.adeptus.titanicus.api.entity.*;
import com.gox.adeptus.titanicus.api.entity.type.WeaponType;
import com.gox.adeptus.titanicus.api.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class AdeptusTitanicusCommandLineRunner implements CommandLineRunner {

    @Autowired
    private TitanPatternRepository titanPatternRepository;

    @Autowired
    private TitanPatternRequirementRepository titanPatternRequirementRepository;

    @Autowired
    private TitanRepository titanRepository;

    @Autowired
    private WeaponRepository weaponRepository;

    @Autowired
    private BannerPatternRepository bannerPatternRepository;

    @Autowired
    private ManiplePatternRepository maniplePatternRepository;

    @Autowired
    private ManipleRepository manipleRepository;

    @Override
    public void run(String... args) throws Exception {
        Weapon w1 = new Weapon("Arioch Titan Power Claw", WeaponType.ARM, 25);
        Weapon w2 = new Weapon("Belicosa Volcano Cannon", WeaponType.ARM, 55);
        Weapon w3 = new Weapon("Macro-gatling Blaster", WeaponType.ARM, 30);
        Weapon w4 = new Weapon("Mori Quake Cannon", WeaponType.ARM, 20);
        Weapon w5 = new Weapon("Sunfury Plasma Annihilator", WeaponType.ARM, 45);
        Weapon w6 = new Weapon("Apocalypse Missile Launchers", WeaponType.CARAPACE, 15);
        Weapon w7 = new Weapon("Paired Gatling Blasters", WeaponType.CARAPACE, 30);
        Weapon w8 = new Weapon("Paired Laser Blasters", WeaponType.CARAPACE, 50);
        Weapon w9 = new Weapon("Paired Turbo Laser Destructors", WeaponType.CARAPACE, 35);
        Weapon w10 = new Weapon("Vulcan Mega-bolter Array", WeaponType.CARAPACE, 20);
        Weapon w11 = new Weapon("Gatling Blaster", WeaponType.ARM, 15);
        Weapon w12 = new Weapon("Laser Blaster", WeaponType.ARM, 25);
        Weapon w13 = new Weapon("Melta Cannon", WeaponType.ARM, 35);
        Weapon w14 = new Weapon("Volcano Cannon", WeaponType.ARM, 25);
        Weapon w15 = new Weapon("Bellicosa Volcano Cannon", WeaponType.CARAPACE, 55);
        Weapon w16 = new Weapon("Mori Quake Cannon", WeaponType.CARAPACE, 20);

        weaponRepository.save(w1);
        weaponRepository.save(w2);
        weaponRepository.save(w3);
        weaponRepository.save(w4);
        weaponRepository.save(w5);
        weaponRepository.save(w6);
        weaponRepository.save(w7);
        weaponRepository.save(w8);
        weaponRepository.save(w9);
        weaponRepository.save(w10);
        weaponRepository.save(w11);
        weaponRepository.save(w12);
        weaponRepository.save(w13);
        weaponRepository.save(w14);
        weaponRepository.save(w15);
        weaponRepository.save(w16);

        BannerPattern b1 = new BannerPattern("Acastus Knight Banner", 150);
        BannerPattern b2 = new BannerPattern("Cerastus Knight Banner", 130);
        BannerPattern b3 = new BannerPattern("Questoris Knight Banner", 120);
        bannerPatternRepository.save(b1);
        bannerPatternRepository.save(b2);
        bannerPatternRepository.save(b3);

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

        ManiplePattern m1 = new ManiplePattern("Axiom Battleline Maniple", 685);
        ManiplePattern m2 = new ManiplePattern("Myrmidon Battleline Maniple", 815);

        TitanPatternRequirement tpr1 = new TitanPatternRequirement(t2, 1, 1);
        TitanPatternRequirement tpr2 = new TitanPatternRequirement(t4, 1, 1);
        TitanPatternRequirement tpr3 = new TitanPatternRequirement(t5, 1, 1);
        titanPatternRequirementRepository.save(tpr1);
        titanPatternRequirementRepository.save(tpr2);
        titanPatternRequirementRepository.save(tpr3);
        m1.getRequiredTitans().addAll(Arrays.asList(tpr1, tpr2, tpr3));
        m1.getOptionalTitans().addAll(Arrays.asList(tpr2, tpr3));

        TitanPatternRequirement tpr4 = new TitanPatternRequirement(t2, 2, 2);
        titanPatternRequirementRepository.save(tpr4);
        m2.getRequiredTitans().addAll(Arrays.asList(tpr4, tpr2));
        m2.getOptionalTitans().addAll(Arrays.asList(tpr1, tpr2));

        maniplePatternRepository.save(m1);
        maniplePatternRepository.save(m2);

        Maniple maniple = new Maniple();
        maniple.setPattern(m2);

        Titan tit1 = new Titan();
        tit1.setLeftArm(w1);
        tit1.setRightArm(w2);
        tit1.setCarapace(w3);
        tit1.setPattern(t2);
        titanRepository.save(tit1);
        Titan tit2 = new Titan();
        tit2.setLeftArm(w1);
        tit2.setRightArm(w2);
        tit2.setCarapace(w3);
        tit2.setPattern(t2);
        titanRepository.save(tit2);
        Titan tit3 = new Titan();
        tit3.setLeftArm(w1);
        tit3.setRightArm(w2);
        tit3.setPattern(t4);
        titanRepository.save(tit3);

        maniple.getTitans().add(tit1);
        maniple.getTitans().add(tit2);
        maniple.getTitans().add(tit3);
        manipleRepository.save(maniple);

    }
}