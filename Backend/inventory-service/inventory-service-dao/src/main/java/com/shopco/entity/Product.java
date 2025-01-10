package com.shopco.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "product", schema = "inventory_service")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {
    @Column(name = "product_id")
    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID productId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "created_date")
    @CreatedDate
    private String createdDate;

    @Column(name = "updated_date")
    @LastModifiedDate
    private String updatedDate;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private List<Review> reviews;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private List<FAQ> faqs;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private List<DressStyle> dressStyles;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private List<Discount> discounts;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ProductVariant> productVariants;


}
