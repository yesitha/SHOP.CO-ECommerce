package com.shopco.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.util.UUID;

@Entity
@Table(name = "review", schema = "inventory_service")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Review {

    @Column(name = "review_id")
    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID reviewId;

    @Column(name = "ratinng")
    private int rating;

    @Column(name = "comment")
    private String comment;

    @Column(name = "created_date")
    @CreatedDate
    private String createdDate;

    @Column(name = "user_id")

    private UUID userId;

    @Column(name = "order_id")

    private UUID orderId;

}
