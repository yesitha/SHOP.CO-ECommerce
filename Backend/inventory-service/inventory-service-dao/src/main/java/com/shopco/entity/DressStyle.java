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
@Table(name = "dress_style", schema = "inventory_service")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public class DressStyle {

    @Column(name = "dress_style_id")
    @Id

    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID dressStyleId;

    @Column(name = "dress_style_name")
    private String dressStyleName;

    @Column(name = "dress_style_description")
    private String dressStyleDescription;

    @Column(name = "created_date")
    @CreatedDate
    private Date createdDate;

    @Column(name = "updated_date")
    @LastModifiedDate
    private Date updatedDate;


    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Image dressStyleImage;

}
