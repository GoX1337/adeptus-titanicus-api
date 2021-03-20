package com.gox.adeptus.titanicus.api.component;

import com.gox.adeptus.titanicus.api.entity.BannerPattern;
import com.gox.adeptus.titanicus.api.repository.BannerPatternRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BannerCommandLineRunner implements CommandLineRunner {

    @Autowired
    private BannerPatternRepository bannerPatternRepository;

    @Override
    public void run(String... args) throws Exception {
        BannerPattern b1 = new BannerPattern("Acastus Knight Banner", 150);
        BannerPattern b2 = new BannerPattern("Cerastus Knight Banner", 130);
        BannerPattern b3 = new BannerPattern("Questoris Knight Banner", 120);

        bannerPatternRepository.save(b1);
        bannerPatternRepository.save(b2);
        bannerPatternRepository.save(b3);
    }
}