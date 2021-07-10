package com.gox.adeptus.titanicus.api.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Titan {

    @Id
    @GeneratedValue
    private UUID id;

    @OneToOne
    @JoinColumn(name="pattern_id")
    private TitanPattern pattern;

    @OneToOne
    @JoinColumn(name="left_arm_weapon_id")
    private Weapon leftArm;

    @OneToOne
    @JoinColumn(name="right_arm_weapon_id")
    private Weapon rightArm;

    @OneToOne
    @JoinColumn(name="carapace_weapon_id")
    private Weapon carapace;
}
