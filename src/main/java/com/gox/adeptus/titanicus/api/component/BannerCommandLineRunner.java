package com.gox.adeptus.titanicus.api.component;

import com.gox.adeptus.titanicus.api.entity.Banner;
import com.gox.adeptus.titanicus.api.repository.BannerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BannerCommandLineRunner implements CommandLineRunner {

    @Autowired
    private BannerRepository bannerRepository;

    @Override
    public void run(String... args) throws Exception {
        Banner b1 = new Banner("Acastus Knight Banner", 150);
        Banner b2 = new Banner("Cerastus Knight Banner", 130);
        Banner b3 = new Banner("Questoris Knight Banner", 120);

        bannerRepository.save(b1);
        bannerRepository.save(b2);
        bannerRepository.save(b3);
    }
}