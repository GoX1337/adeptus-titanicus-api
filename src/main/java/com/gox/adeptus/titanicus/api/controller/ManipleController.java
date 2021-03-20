package com.gox.adeptus.titanicus.api.controller;

import com.gox.adeptus.titanicus.api.entity.Maniple;
import com.gox.adeptus.titanicus.api.service.ManipleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("maniple")
public class ManipleController {

    @Autowired
    private ManipleService manipleService;

    @GetMapping
    public List<Maniple> get(){
        return manipleService.findAll();
    }
}
