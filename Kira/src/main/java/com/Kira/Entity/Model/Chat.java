package com.Kira.Entity.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ChatId;

    private Integer PlayerId;

    private String Content;

    @Enumerated(EnumType.STRING)
    private ChatType ChatType;

    @Temporal(TemporalType.TIMESTAMP)
    private Date CreateTime;

    public enum ChatType {
        PUBLIC, KILLER, POLICE, GHOST
    }
}
