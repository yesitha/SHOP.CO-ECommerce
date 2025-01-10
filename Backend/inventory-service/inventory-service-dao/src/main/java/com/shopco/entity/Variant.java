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
@Table(name = "varient", schema = "inventory_service")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Variant {

    @Column(name = "variant_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID variantId;

    @Column(name = "variant_name")
    private String variantName;

    @Column(name = "created_date")
    @CreatedDate
    private String createdDate;

    @Column(name = "updated_date")
    @LastModifiedDate
    private String updatedDate;

    @OneToMany(mappedBy = "variant", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ProductVariant> productVariants;


}
