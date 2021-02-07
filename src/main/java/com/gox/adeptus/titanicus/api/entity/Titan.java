package com.gox.adeptus.titanicus.api.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Getter
@Setter
public class Titan {

    @Id
    @GeneratedValue
    private UUID id;

    @Column
    private String name;

    @Column
    private int cost;

    public Titan() {
    }

    public Titan(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }
}
