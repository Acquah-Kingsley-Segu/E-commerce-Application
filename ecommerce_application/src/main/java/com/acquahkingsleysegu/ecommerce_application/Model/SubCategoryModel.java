package com.acquahkingsleysegu.ecommerce_application.Model;

import com.acquahkingsleysegu.ecommerce_application.Entity.ItemEntity;
import com.acquahkingsleysegu.ecommerce_application.Entity.MainCategoryEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubCategoryModel {
    private Long Id;
    private String name;
    private String description;
    private MainCategoryEntity mainCategoryID;
    List<ItemEntity> itemEntities;
}
