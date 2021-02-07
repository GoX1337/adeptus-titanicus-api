package com.gox.adeptus.titanicus.api.component;

import com.gox.adeptus.titanicus.api.entity.Weapon;
import com.gox.adeptus.titanicus.api.entity.type.WeaponType;
import com.gox.adeptus.titanicus.api.repository.WeaponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class WeaponCommandLineRunner implements CommandLineRunner {

    @Autowired
    private WeaponRepository weaponRepository;

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
        Weapon w17 = new Weapon("Arioch Titan Power Claw", WeaponType.ARM, 25);
        Weapon w18 = new Weapon("Belicosa Volcano Cannon", WeaponType.ARM, 55);
        Weapon w19 = new Weapon("Macro-gatling Blaster", WeaponType.ARM, 30);
        Weapon w20 = new Weapon("Mori Quake Cannon", WeaponType.ARM, 20);
        Weapon w21 = new Weapon("Sunfury Plasma Annihilator", WeaponType.ARM, 45);
        Weapon w22 = new Weapon("Apocalypse Missile Launchers", WeaponType.CARAPACE, 15);
        Weapon w23 = new Weapon("Paired Gatling Blasters", WeaponType.CARAPACE, 30);
        Weapon w24 = new Weapon("Paired Laser Blasters", WeaponType.CARAPACE, 50);
        Weapon w25 = new Weapon("Paired Turbo Laser Destructors", WeaponType.CARAPACE, 35);
        Weapon w26 = new Weapon("Vulcan Mega-bolter Array", WeaponType.CARAPACE, 20);
        Weapon w27 = new Weapon("Volcano Cannon", WeaponType.ARM, 25);
        Weapon w28 = new Weapon("Melta Cannon", WeaponType.ARM, 35);
        Weapon w29 = new Weapon("Reaver Titan Power Fist", WeaponType.ARM, 20);
        Weapon w30 = new Weapon("Laser Blaster", WeaponType.ARM, 25);
        Weapon w31 = new Weapon("Reaver Titan Chainfist", WeaponType.ARM, 20);
        Weapon w32 = new Weapon("Gatling Blaster", WeaponType.ARM, 15);
        Weapon w33 = new Weapon("Turbo Laser Destructor", WeaponType.CARAPACE, 20);
        Weapon w34 = new Weapon("Apocalypse Missile Launcher", WeaponType.CARAPACE, 10);
        Weapon w35 = new Weapon("Vulcain Mega-bolter", WeaponType.CARAPACE, 10);
        Weapon w36 = new Weapon("Warp Missible Support Rack", WeaponType.CARAPACE, 10);
        Weapon w37 = new Weapon("Turbo Laser Destructor", WeaponType.ARM, 20);
        Weapon w38 = new Weapon("Inferno Gun", WeaponType.ARM, 20);
        Weapon w39 = new Weapon("Vulcain Mega-bolter", WeaponType.ARM, 10);
        Weapon w40 = new Weapon("Natrix Shock Lance", WeaponType.ARM, 20);
        Weapon w41 = new Weapon("Plasma Blast Gun", WeaponType.ARM, 30);
        Weapon w42 = new Weapon("Ursaw Claw", WeaponType.ARM, 10);

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
        weaponRepository.save(w17);
        weaponRepository.save(w18);
        weaponRepository.save(w19);
        weaponRepository.save(w20);
        weaponRepository.save(w21);
        weaponRepository.save(w22);
        weaponRepository.save(w23);
        weaponRepository.save(w24);
        weaponRepository.save(w25);
        weaponRepository.save(w26);
        weaponRepository.save(w27);
        weaponRepository.save(w28);
        weaponRepository.save(w29);
        weaponRepository.save(w30);
        weaponRepository.save(w31);
        weaponRepository.save(w32);
        weaponRepository.save(w33);
        weaponRepository.save(w34);
        weaponRepository.save(w35);
        weaponRepository.save(w36);
        weaponRepository.save(w37);
        weaponRepository.save(w38);
        weaponRepository.save(w39);
        weaponRepository.save(w40);
        weaponRepository.save(w41);
        weaponRepository.save(w42);
    }
}