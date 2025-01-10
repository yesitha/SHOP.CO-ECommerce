package com.shopco.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.UUID;

@Entity
@Table(name = "image", schema = "inventory_service")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Image {

    @Column(name = "image_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID imageId;

    @Lob
    @Column(name = "image_content")
    private Byte[] imageContent;

    @Column(name = "image_name")
    private String imageName;

    @Column(name = "created_date")
    @CreatedDate
    private String createdDate;

    @Column(name = "updated_date")
    @LastModifiedDate
    private String updatedDate;


}
