package com.gox.adeptus.titanicus.api.service.impl;

import com.gox.adeptus.titanicus.api.entity.Maniple;
import com.gox.adeptus.titanicus.api.entity.Titan;
import com.gox.adeptus.titanicus.api.repository.ManipleRepository;
import com.gox.adeptus.titanicus.api.repository.TitanRepository;
import com.gox.adeptus.titanicus.api.service.ManipleService;
import com.gox.adeptus.titanicus.api.service.TitanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ManipleServiceImpl implements ManipleService {

    @Autowired
    private ManipleRepository manipleRepository;

    public List<Maniple> findAll() {
        List<Maniple> maniples = new ArrayList();
        manipleRepository.findAll().forEach(maniples::add);
        return maniples;
    }
}
