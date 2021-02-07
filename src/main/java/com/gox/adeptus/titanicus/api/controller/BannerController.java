package com.gox.adeptus.titanicus.api.controller;

import com.gox.adeptus.titanicus.api.entity.Banner;
import com.gox.adeptus.titanicus.api.entity.Titan;
import com.gox.adeptus.titanicus.api.service.BannerService;
import com.gox.adeptus.titanicus.api.service.TitanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("banner")
public class BannerController {

    @Autowired
    private BannerService bannerService;

    @GetMapping
    public List<Banner> get(){
        return bannerService.findAll();

    }
}
