package com.shopco.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "brand", schema = "inventory_service")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Brand {

    @Column(name = "brand_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID brandId;

    @Column(name = "brand_name")
    private String brandName;

    @Column(name = "description")
    private String description;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Image brandLogo;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "brand_id")
    private List<Product> products;
}
