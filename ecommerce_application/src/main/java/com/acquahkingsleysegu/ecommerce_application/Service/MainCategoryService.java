package com.acquahkingsleysegu.ecommerce_application.Service;

import com.acquahkingsleysegu.ecommerce_application.Entity.MainCategoryEntity;
import com.acquahkingsleysegu.ecommerce_application.Entity.SubCategoryEntity;
import com.acquahkingsleysegu.ecommerce_application.Model.MainCategoryModel;

import java.util.List;


public interface MainCategoryService {
    MainCategoryModel createCategory(MainCategoryModel category);
    List<MainCategoryModel> getCategories();
    MainCategoryModel getCategoryById(Long id);
    MainCategoryModel getCategoryByName(String name);
    MainCategoryModel updateCategory(Long id, MainCategoryModel category);
    boolean deleteCategory(Long id);
}
