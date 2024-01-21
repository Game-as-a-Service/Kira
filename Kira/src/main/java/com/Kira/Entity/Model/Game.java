package com.Kira.Entity.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(length = 18)
    private Integer playerNumber;

    @OneToMany(cascade = CascadeType.ALL)
    private ArrayList<Player> players;

    private String winner;
}
