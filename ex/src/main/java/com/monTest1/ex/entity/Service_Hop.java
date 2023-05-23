package com.monTest1.ex.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Service_Hop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="Service_Ky")
    private long Service_Ky;
    private String Service_Name;
}
