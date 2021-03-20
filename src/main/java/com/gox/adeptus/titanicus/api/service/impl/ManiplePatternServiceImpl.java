package com.gox.adeptus.titanicus.api.service.impl;

import com.gox.adeptus.titanicus.api.entity.ManiplePattern;
import com.gox.adeptus.titanicus.api.repository.ManiplePatternRepository;
import com.gox.adeptus.titanicus.api.service.ManiplePatternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ManiplePatternServiceImpl implements ManiplePatternService {

    @Autowired
    private ManiplePatternRepository manipleRepository;

    public List<ManiplePattern> findAll() {
        List<ManiplePattern> maniplePatterns = new ArrayList();
        manipleRepository.findAll().forEach(maniplePatterns::add);
        return maniplePatterns;
    }
}
