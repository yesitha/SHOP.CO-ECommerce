package com.shopco.paymentservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "transaction", schema = "payment_service")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Transaction {
    @Id
    @Lob
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "transaction_id")
    private UUID transactionId;
    private Double amount;

    @Column(name = "transaction_date_time")
    private Date transactionDateTime;


}
