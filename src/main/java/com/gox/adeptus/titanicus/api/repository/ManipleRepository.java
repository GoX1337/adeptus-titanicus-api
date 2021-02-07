package com.gox.adeptus.titanicus.api.repository;

import com.gox.adeptus.titanicus.api.entity.Maniple;
import com.gox.adeptus.titanicus.api.entity.Titan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ManipleRepository extends CrudRepository<Maniple, UUID> {
}
