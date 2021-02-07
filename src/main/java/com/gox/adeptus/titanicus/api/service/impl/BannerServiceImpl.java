package com.gox.adeptus.titanicus.api.service.impl;

import com.gox.adeptus.titanicus.api.entity.Banner;
import com.gox.adeptus.titanicus.api.entity.Titan;
import com.gox.adeptus.titanicus.api.repository.BannerRepository;
import com.gox.adeptus.titanicus.api.repository.TitanRepository;
import com.gox.adeptus.titanicus.api.service.BannerService;
import com.gox.adeptus.titanicus.api.service.TitanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BannerServiceImpl implements BannerService {

    @Autowired
    private BannerRepository bannerRepository;

    public List<Banner> findAll() {
        List<Banner> banners = new ArrayList();
        bannerRepository.findAll().forEach(banners::add);
        return banners;
    }
}
