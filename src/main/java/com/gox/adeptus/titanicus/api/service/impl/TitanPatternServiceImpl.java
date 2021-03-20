package com.gox.adeptus.titanicus.api.service.impl;

import com.gox.adeptus.titanicus.api.entity.TitanPattern;
import com.gox.adeptus.titanicus.api.repository.TitanPatternRepository;
import com.gox.adeptus.titanicus.api.service.TitanPatternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TitanPatternServiceImpl implements TitanPatternService {

    @Autowired
    private TitanPatternRepository titanRepository;

    public List<TitanPattern> findAll() {
        List<TitanPattern> titanPatterns = new ArrayList();
        titanRepository.findAll().forEach(titanPatterns::add);
        return titanPatterns;
    }
}
