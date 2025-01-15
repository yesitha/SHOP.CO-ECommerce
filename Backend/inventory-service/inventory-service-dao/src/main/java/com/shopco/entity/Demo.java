package com.shopco.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "demo", schema = "inventory_service")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
//To be removed
public class Demo {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "demo_name")
    private String demoName;


}
