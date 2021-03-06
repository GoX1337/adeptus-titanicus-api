package com.gox.adeptus.titanicus.api.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Battlegroup {

    @Id
    @GeneratedValue
    private UUID id;

    @Column
    private String name;

    @OneToMany
    private List<Maniple> maniples;

    @OneToMany
    private List<Titan> titans;

}
