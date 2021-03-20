package com.gox.adeptus.titanicus.api.controller;

import com.gox.adeptus.titanicus.api.entity.TitanPattern;
import com.gox.adeptus.titanicus.api.service.TitanPatternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("titan")
public class TitanPatternController {

    @Autowired
    private TitanPatternService titanPatternService;

    @GetMapping
    public List<TitanPattern> get(){
        return titanPatternService.findAll();

    }
}
