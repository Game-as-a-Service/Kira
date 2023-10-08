package com.Kira.Entity.Model;

<<<<<<< HEAD
import jakarta.persistence.*;
=======
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
>>>>>>> 1522d02 (basic configuration)
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Room {
    @Id
<<<<<<< HEAD
    @GeneratedValue(strategy = GenerationType.AUTO)
=======
>>>>>>> 1522d02 (basic configuration)
    private Integer id;

    @Column(length = 18)
    private Integer totalNumber;

    private Integer currentNumber;

    private Boolean hasPassword;

    private String password;

<<<<<<< HEAD
    @Enumerated(EnumType.STRING)
    private statusType status = statusType.WAITING;

    private Integer gameId;

    public enum statusType {
        WAITING, PLAYING, END
    }
=======
    private String status;

    private Integer gameId;
>>>>>>> 1522d02 (basic configuration)
}
