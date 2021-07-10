package com.gox.adeptus.titanicus.api.entity;

import com.gox.adeptus.titanicus.api.entity.type.WeaponType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Weapon {

    @Id
    @GeneratedValue
    private UUID id;

    @Column
    private String name;

    @Column
    private WeaponType type;

    @Column
    private int cost;

    public Weapon(String name, WeaponType type, int cost) {
        this.name = name;
        this.type = type;
        this.cost = cost;
    }
}
