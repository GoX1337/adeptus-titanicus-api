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
public class TitanPatternRequirement {

    @Id
    @GeneratedValue
    private UUID id;

    @OneToOne
    @JoinColumn(name="titan_pattern_id")
    private TitanPattern titanPattern;

    private int min;

    private int max;

    public TitanPatternRequirement(TitanPattern titanPattern, int min, int max) {
        this.titanPattern = titanPattern;
        this.min = min;
        this.max = max;
    }
}
