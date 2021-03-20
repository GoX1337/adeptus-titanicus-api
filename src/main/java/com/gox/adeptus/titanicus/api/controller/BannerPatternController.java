package com.gox.adeptus.titanicus.api.controller;

import com.gox.adeptus.titanicus.api.entity.BannerPattern;
import com.gox.adeptus.titanicus.api.service.BannerPatternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("banner")
public class BannerPatternController {

    @Autowired
    private BannerPatternService bannerPatternService;

    @GetMapping
    public List<BannerPattern> get(){
        return bannerPatternService.findAll();

    }
}
