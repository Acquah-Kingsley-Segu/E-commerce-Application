package com.acquahkingsleysegu.ecommerce_application.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "main_category")
@Data
public class MainCategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String name;
    String description;

    @OneToMany(targetEntity = SubCategoryEntity.class, mappedBy = "mainCategoryID", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SubCategoryEntity> subCategoryEntities;
}
