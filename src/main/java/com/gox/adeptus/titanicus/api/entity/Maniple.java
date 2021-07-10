package com.gox.adeptus.titanicus.api.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Maniple {

    @Id
    @GeneratedValue
    private UUID id;

    @OneToOne
    @JoinColumn(name="maniple_pattern_id")
    private ManiplePattern pattern;

    @OneToMany
    @JoinColumn(name = "titan_id")
    private List<Titan> titans;

    public List<Titan> getTitans() {
        if(titans == null){
            titans = new ArrayList<>();
        }
        return titans;
    }
}
