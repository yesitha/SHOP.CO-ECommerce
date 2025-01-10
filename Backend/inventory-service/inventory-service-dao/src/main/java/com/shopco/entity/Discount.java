package com.shopco.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "discount", schema = "inventory_service")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Discount {

    @Column(name = "discount_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID discountId;

    @Column(name = "discount_name")
    private String discountName;

    @Column(name = "discount_code")
    private String discountCode;

    @Column(name = "discount_description")
    private String discountDescription;

    @Column(name = "discount_percentage")
    private double discountPercentage;

    @Column(name = "discount_amount")
    private double discountAmount;

    @Column(name = "discount_start_date")
    private Date discountStartDate;

    @Column(name = "discount_end_date")
    private Date discountEndDate;

    @Column(name = "discount_status")
    private String discountStatus;

    @Column(name = "valid_time_in_days")
    private int validTime;

    @Column(name = "created_date")
    @CreatedDate
    private Date createdDate;

    @Column(name = "updated_date")
    @LastModifiedDate
    private Date updatedDate;


}
