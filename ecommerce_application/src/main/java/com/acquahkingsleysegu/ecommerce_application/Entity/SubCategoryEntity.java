package com.acquahkingsleysegu.ecommerce_application.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "sub_category")
@Data
public class SubCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "scat_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "main_id")
    private MainCategoryEntity mainCategory;

    private String name;
    private String description;
}
