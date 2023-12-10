package com.Kira.Entity.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(length = 18)
    private Integer totalNumber;

    private Integer currentNumber;

    private Boolean hasPassword;

    private String password;

    @Enumerated(EnumType.STRING)
    private statusType status = statusType.WAITING;

    private Integer gameId;

    public enum statusType {
        WAITING, PLAYING, END
    }
}
