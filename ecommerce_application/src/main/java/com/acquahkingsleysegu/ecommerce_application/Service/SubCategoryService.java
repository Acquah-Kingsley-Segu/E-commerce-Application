package com.acquahkingsleysegu.ecommerce_application.Service;

import com.acquahkingsleysegu.ecommerce_application.Entity.SubCategoryEntity;
import com.acquahkingsleysegu.ecommerce_application.Model.SubCategoryModel;
import org.springframework.stereotype.Service;

import java.util.List;

public interface SubCategoryService {
    SubCategoryModel createSubCategory(SubCategoryModel subCategoryModel);
    List<SubCategoryModel> getSubCategories();

    SubCategoryModel getSubCategoryById(Long id);
    SubCategoryModel getSubCategoryByName(String name);
    SubCategoryModel updateSubCategory(Long id, SubCategoryModel subCategoryModel);
    boolean deleteSubCategory(Long id);
}
