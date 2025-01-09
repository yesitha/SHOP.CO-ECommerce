package com.shopco.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "faq", schema = "inventory_service")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FAQ {

    @Column(name = "faq_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID faqId;

    @Column(name = "question")
    private String question;

    @Column(name = "answer")
    private String answer;

}
