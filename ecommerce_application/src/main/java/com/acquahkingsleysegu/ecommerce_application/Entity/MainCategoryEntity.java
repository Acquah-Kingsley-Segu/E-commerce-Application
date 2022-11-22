package com.acquahkingsleysegu.ecommerce_application.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "main_category")
@Data
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "main_id")
    private Long id;

    @OneToMany(mappedBy = "mainCategory", fetch=FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<SubCategory> subCategories = new HashSet<>();

    String name;
    String description;
}
