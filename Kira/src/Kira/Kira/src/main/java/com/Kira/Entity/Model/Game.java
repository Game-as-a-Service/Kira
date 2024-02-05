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

    private Integer playerNumber;

    //whyOneToMany?
    @OneToMany(cascade = CascadeType.ALL)
    private ArrayList<Player> players;

    //遊戲最終結果:平手、殺手贏了、警察贏了
    private String Results;
}
