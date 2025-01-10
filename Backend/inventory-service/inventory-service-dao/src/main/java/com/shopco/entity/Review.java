package com.shopco.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "review", schema = "inventory_service")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public class Review {

    @Column(name = "review_id")
    @Id

    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID reviewId;

    @Column(name = "ratinng")
    private Integer rating;

    @Column(name = "comment")
    private String comment;

    @Column(name = "created_date")
    @CreatedDate
    private Date createdDate;



    @Column(name = "user_id")

    private UUID userId;

    @Column(name = "order_id")

    private UUID orderId;

}
