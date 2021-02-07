package com.gox.adeptus.titanicus.api.service.impl;

import com.gox.adeptus.titanicus.api.entity.Weapon;
import com.gox.adeptus.titanicus.api.repository.WeaponRepository;
import com.gox.adeptus.titanicus.api.service.WeaponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WeaponServiceImpl implements WeaponService {

    @Autowired
    private WeaponRepository weaponRepository;

    public List<Weapon> findAll() {
        List<Weapon> weapons = new ArrayList();
        weaponRepository.findAll().forEach(weapons::add);
        return weapons;
    }
}
