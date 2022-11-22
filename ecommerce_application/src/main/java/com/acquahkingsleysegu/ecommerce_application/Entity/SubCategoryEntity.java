package com.acquahkingsleysegu.ecommerce_application.Entity;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "sub_category")
@Data
public class SubCategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "scat_id")
    private Long id;
    private String name;
    private String description;

    @ManyToOne
    @JoinColumn(name = "mainID", referencedColumnName = "id")
    private MainCategoryEntity mainCategoryID;

    @OneToMany(targetEntity = ItemEntity.class, mappedBy = "subCategoryEntity", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    List<ItemEntity> itemEntities;
}
