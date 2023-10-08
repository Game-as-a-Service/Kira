package com.Kira.Entity.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Room {
    @Id
    private Integer id;

    @Column(length = 18)
    private Integer totalNumber;

    private Integer currentNumber;

    private Boolean hasPassword;

    private String password;

    private String status;

    private Integer gameId;
}