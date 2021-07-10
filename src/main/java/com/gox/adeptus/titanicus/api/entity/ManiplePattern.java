package com.gox.adeptus.titanicus.api.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ManiplePattern {

    @Id
    @GeneratedValue
    private UUID id;

    @Column
    private String name;

    @Column
    private int cost;

    @ManyToMany
    private Set<TitanPatternRequirement> requiredTitans;

    @ManyToMany
    private Set<TitanPatternRequirement> optionalTitans;

    public ManiplePattern(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public Set<TitanPatternRequirement> getRequiredTitans() {
        if(requiredTitans == null){
            requiredTitans = new HashSet<>();
        }
        return requiredTitans;
    }

    public Set<TitanPatternRequirement> getOptionalTitans() {
        if(optionalTitans == null){
            optionalTitans = new HashSet<>();
        }
        return optionalTitans;
    }
}
