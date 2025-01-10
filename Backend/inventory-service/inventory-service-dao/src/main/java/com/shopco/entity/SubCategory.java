package com.shopco.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "sub_category", schema = "inventory_service")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SubCategory {

    @Column(name = "sub_category_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID subCategoryId;

    @Column(name = "sub_category_name")
    private String subCategoryName;

    @Column(name = "description")
    private String description;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Image subCategoryImage;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "sub_category_id")
    private List<Product> products;
}
