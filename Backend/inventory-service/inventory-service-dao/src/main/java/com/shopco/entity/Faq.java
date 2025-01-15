package com.shopco.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
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
@Table(name = "faq", schema = "inventory_service")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public class Faq {

    @Column(name = "faq_id")
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID faqId;

    @Column(name = "question")
    @NotBlank(message = "Question cannot be empty")
    private String question;

    @Column(name = "answer")
    @NotBlank(message = "Answer cannot be empty")
    private String answer;

    @Column(name = "created_date")
    @CreatedDate
    private Date createdDate;

    @Column(name = "updated_date")
    @LastModifiedDate
    private Date updatedDate;

}
