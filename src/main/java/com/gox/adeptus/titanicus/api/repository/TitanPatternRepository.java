package com.gox.adeptus.titanicus.api.repository;

import com.gox.adeptus.titanicus.api.entity.TitanPattern;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TitanPatternRepository extends CrudRepository<TitanPattern, UUID> {

    TitanPattern findByName(String name);
}
