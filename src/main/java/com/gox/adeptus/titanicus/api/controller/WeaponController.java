package com.gox.adeptus.titanicus.api.controller;

import com.gox.adeptus.titanicus.api.entity.Weapon;
import com.gox.adeptus.titanicus.api.service.WeaponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("weapon")
public class WeaponController {

    @Autowired
    private WeaponService weaponService;

    @GetMapping
    public List<Weapon> get(){
        return weaponService.findAll();

    }
}
