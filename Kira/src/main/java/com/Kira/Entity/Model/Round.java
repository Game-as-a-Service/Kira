package com.Kira.Entity.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Round {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer gameId;

    private Integer currentRound;

    private RoundTime roundTime;

    public enum RoundTime {
        DAY, NIGHT
    }
}
