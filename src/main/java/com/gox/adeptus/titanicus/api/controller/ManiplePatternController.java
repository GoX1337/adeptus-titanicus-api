package com.gox.adeptus.titanicus.api.controller;

import com.gox.adeptus.titanicus.api.entity.ManiplePattern;
import com.gox.adeptus.titanicus.api.service.ManiplePatternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("maniple")
public class ManiplePatternController {

    @Autowired
    private ManiplePatternService maniplePatternService;

    @GetMapping
    public List<ManiplePattern> get(){
        return maniplePatternService.findAll();
    }
}
