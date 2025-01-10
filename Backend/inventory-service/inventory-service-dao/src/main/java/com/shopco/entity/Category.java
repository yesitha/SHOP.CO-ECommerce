package com.shopco.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "category", schema = "inventory_service")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Category {

    @Column(name = "category_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID categoryId;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "description")
    private String description;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Image categoryImage;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private List<SubCategory> subCategories;
}
