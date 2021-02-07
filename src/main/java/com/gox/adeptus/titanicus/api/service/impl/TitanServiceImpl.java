package com.gox.adeptus.titanicus.api.service.impl;

import com.gox.adeptus.titanicus.api.entity.Titan;
import com.gox.adeptus.titanicus.api.entity.Weapon;
import com.gox.adeptus.titanicus.api.repository.TitanRepository;
import com.gox.adeptus.titanicus.api.repository.WeaponRepository;
import com.gox.adeptus.titanicus.api.service.TitanService;
import com.gox.adeptus.titanicus.api.service.WeaponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TitanServiceImpl implements TitanService {

    @Autowired
    private TitanRepository titanRepository;

    public List<Titan> findAll() {
        List<Titan> titans = new ArrayList();
        titanRepository.findAll().forEach(titans::add);
        return titans;
    }
}
