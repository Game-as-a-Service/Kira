package com.Kira.Entity.Model;

<<<<<<< HEAD
<<<<<<< HEAD
import jakarta.persistence.*;
=======
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
>>>>>>> 1522d02 (basic configuration)
=======
import jakarta.persistence.*;
>>>>>>> 9036ed5 (basic crud apis)
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Room {
    @Id
<<<<<<< HEAD
<<<<<<< HEAD
    @GeneratedValue(strategy = GenerationType.AUTO)
=======
>>>>>>> 1522d02 (basic configuration)
=======
    @GeneratedValue(strategy = GenerationType.AUTO)
>>>>>>> 9036ed5 (basic crud apis)
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
