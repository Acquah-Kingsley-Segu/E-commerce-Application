package com.acquahkingsleysegu.ecommerce_application.Model;

import com.acquahkingsleysegu.ecommerce_application.Entity.SubCategoryEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ItemModel {
    private Long id;
    private String name;
    private String description;
    private Double price;
    private Integer qty;
    private SubCategoryEntity subCategoryEntity;
}
