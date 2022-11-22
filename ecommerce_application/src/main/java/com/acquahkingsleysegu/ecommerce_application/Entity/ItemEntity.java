package com.acquahkingsleysegu.ecommerce_application.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "item")
@Data
public class ItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double price;
    private Integer qty;
    @ManyToOne
    @JoinColumn(name = "cat_id", referencedColumnName = "scat_id")
    private SubCategoryEntity subCategoryEntity;
}
