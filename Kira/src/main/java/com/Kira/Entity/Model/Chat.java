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
    private Integer chatId;

    private Integer playerId;

    private String content;

    @Enumerated(EnumType.STRING)
    private ChatType chatType;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

    public enum ChatType {
        PUBLIC, KILLER, POLICE, GHOST
    }
}
