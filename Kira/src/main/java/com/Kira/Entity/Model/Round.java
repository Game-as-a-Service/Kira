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
    private Integer Id;

    private Integer GameId;

    private Integer CurrentRound;

    private RoundTime RoundTime;

    public enum RoundTime {
        DAY, NIGHT
    }
}
