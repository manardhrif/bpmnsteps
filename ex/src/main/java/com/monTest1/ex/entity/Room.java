package com.monTest1.ex.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Room_Ky",unique = true)
    private long Room_Ky;
    private String Room_Name ;
    @OneToOne( targetEntity = GroupRoom.class ,cascade = CascadeType.ALL)
    @JoinColumn (name="Room_GroupRoomKy",referencedColumnName = "GroupRoom_Ky")
    private long Room_GroupRoomKy ;
}