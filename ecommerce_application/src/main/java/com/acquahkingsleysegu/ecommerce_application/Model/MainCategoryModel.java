package com.acquahkingsleysegu.ecommerce_application.Model;

import com.acquahkingsleysegu.ecommerce_application.Entity.SubCategoryEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MainCategoryModel {
    private Long id;
    private String name;
    private List<SubCategoryEntity> subCategories;
    private String description;
}
