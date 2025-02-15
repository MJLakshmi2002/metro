package com.example.metroservice.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Station {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String location;
}