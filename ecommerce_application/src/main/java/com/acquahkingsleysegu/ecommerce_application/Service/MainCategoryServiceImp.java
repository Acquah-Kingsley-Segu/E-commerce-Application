package com.acquahkingsleysegu.ecommerce_application.Service;

import com.acquahkingsleysegu.ecommerce_application.Entity.MainCategoryEntity;
import com.acquahkingsleysegu.ecommerce_application.Entity.SubCategoryEntity;
import com.acquahkingsleysegu.ecommerce_application.Model.MainCategoryModel;
import com.acquahkingsleysegu.ecommerce_application.Repository.MainCategoryRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service("main_category-service")
public class MainCategoryServiceImp implements MainCategoryService{

    @Autowired
    MainCategoryRepository repository;

    public MainCategoryServiceImp(MainCategoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public MainCategoryModel createCategory(MainCategoryModel category) {
        MainCategoryEntity categoryEntity = new MainCategoryEntity();
        categoryEntity.setDescription(category.getDescription());
        categoryEntity.setName(category.getName());

        this.repository.save(categoryEntity);
        return category;
    }

    @Override
    public List<MainCategoryModel> getCategories() {
        List<MainCategoryEntity> mainCategoryEntities =  repository.findAll();
        List<MainCategoryModel> mainCategoryModels = mainCategoryEntities
                .stream()
                .map(entity -> new MainCategoryModel(
                        entity.getId(),
                        entity.getName(),
                        null,
                        entity.getDescription()))
                .collect(Collectors.toList());

        return mainCategoryModels;
    }

    @Override
    public MainCategoryModel getCategoryById(Long id){
        MainCategoryModel mainCategoryModel = new MainCategoryModel();
        MainCategoryEntity mainCategoryEntity = this.repository.findById(id).get();

        mainCategoryModel.setId(mainCategoryEntity.getId());
        mainCategoryModel.setName(mainCategoryEntity.getName());
        mainCategoryModel.setDescription(mainCategoryEntity.getDescription());
        mainCategoryModel.setSubCategories(null);

        return mainCategoryModel;
    }

    @Override
    public MainCategoryModel getCategoryByName(String name) {
        MainCategoryModel categoryModel = new MainCategoryModel();
        MainCategoryEntity categoryEntity = this.repository.findByName(name);
        BeanUtils.copyProperties(categoryEntity, categoryModel);

        return categoryModel;
    }

    @Override
    public MainCategoryModel updateCategory(Long id, MainCategoryModel category) {
        MainCategoryEntity entity = this.repository.findById(id).get();
        entity.setId(category.getId());
        entity.setName(category.getName());
        entity.setDescription(category.getDescription());

        this.repository.save(entity);
        return category;
    }

    @Override
    public boolean deleteCategory(Long id) {
        boolean success = false;
        MainCategoryEntity entity = this.repository.findById(id).get();
        if(entity != null){
            this.repository.deleteById(id);
            return !success;
        }

        return success;
    }
}
