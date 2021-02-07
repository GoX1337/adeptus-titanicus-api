package com.gox.adeptus.titanicus.api.repository;

import com.gox.adeptus.titanicus.api.entity.Banner;
import com.gox.adeptus.titanicus.api.entity.Weapon;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BannerRepository extends CrudRepository<Banner, UUID> {
}
