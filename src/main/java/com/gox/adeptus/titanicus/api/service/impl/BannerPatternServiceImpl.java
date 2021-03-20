package com.gox.adeptus.titanicus.api.service.impl;

import com.gox.adeptus.titanicus.api.entity.BannerPattern;
import com.gox.adeptus.titanicus.api.repository.BannerPatternRepository;
import com.gox.adeptus.titanicus.api.service.BannerPatternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BannerPatternServiceImpl implements BannerPatternService {

    @Autowired
    private BannerPatternRepository bannerPatternRepository;

    public List<BannerPattern> findAll() {
        List<BannerPattern> bannerPatterns = new ArrayList();
        bannerPatternRepository.findAll().forEach(bannerPatterns::add);
        return bannerPatterns;
    }
}
