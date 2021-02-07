package com.gox.adeptus.titanicus.api.controller;

import com.gox.adeptus.titanicus.api.entity.Titan;
import com.gox.adeptus.titanicus.api.entity.Weapon;
import com.gox.adeptus.titanicus.api.service.TitanService;
import com.gox.adeptus.titanicus.api.service.WeaponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("titan")
public class TitanController {

    @Autowired
    private TitanService titanService;

    @GetMapping
    public List<Titan> get(){
        return titanService.findAll();

    }
}
