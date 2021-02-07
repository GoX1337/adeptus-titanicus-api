package com.gox.adeptus.titanicus.api.entity;

import com.gox.adeptus.titanicus.api.entity.type.WeaponType;
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
public class Banner {

    @Id
    @GeneratedValue
    private UUID id;

    @Column
    private String name;

    @Column
    private int cost;

    public Banner() {
    }

    public Banner(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }
}
