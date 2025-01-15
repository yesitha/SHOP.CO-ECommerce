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
@Table(name = "image", schema = "inventory_service")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public class Image {

    @Column(name = "image_id")
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID imageId;

    @Lob
    @Column(name = "image_content")
    private Byte[] imageContent;

    @Column(name = "image_name")
    @NotBlank(message = "Image name cannot be blank")
    private String imageName;

    @Column(name = "created_date")
    @CreatedDate
    private Date createdDate;

    @Column(name = "updated_date")
    @LastModifiedDate
    private Date updatedDate;


}
