package com.shopco.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "dress_style", schema = "inventory_service")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DressStyle {

    @Column(name = "dress_style_id")
    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID dressStyleId;

    @Column(name = "dress_style_name")
    private String dressStyleName;

    @Column(name = "dress_style_description")
    private String dressStyleDescription;


    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Image dressStyleImage;

}
