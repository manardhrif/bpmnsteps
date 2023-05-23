package com.monTest1.ex.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class GroupRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GroupRoom_Ky", unique = true)
    private long GroupRoom_Ky;
    private String GroupRoom_Name;
    @OneToOne(targetEntity = ServiceArea.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "GroupRoom_serviceArea_Ky", referencedColumnName = "ServiceArea_Ky")
    private long GroupRoom_serviceArea_Ky;
}