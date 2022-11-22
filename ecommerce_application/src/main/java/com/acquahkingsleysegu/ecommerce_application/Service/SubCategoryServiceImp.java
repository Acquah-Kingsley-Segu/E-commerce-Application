package com.acquahkingsleysegu.ecommerce_application.Service;

import com.acquahkingsleysegu.ecommerce_application.Entity.MainCategoryEntity;
import com.acquahkingsleysegu.ecommerce_application.Entity.SubCategoryEntity;
import com.acquahkingsleysegu.ecommerce_application.Model.SubCategoryModel;
import com.acquahkingsleysegu.ecommerce_application.Repository.MainCategoryRepository;
import com.acquahkingsleysegu.ecommerce_application.Repository.SubCategoryRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class SubCategoryServiceImp implements SubCategoryService{
    @Autowired
    private SubCategoryRepository subCategoryRepository;

    public SubCategoryServiceImp(SubCategoryRepository subCategoryRepository) {
        this.subCategoryRepository = subCategoryRepository;
    }

    @Override
    public SubCategoryModel createSubCategory(SubCategoryModel subCategoryModel){
        SubCategoryEntity categoryEntity = new SubCategoryEntity();
        categoryEntity.setDescription(subCategoryModel.getDescription());
        categoryEntity.setName(subCategoryModel.getName());
        categoryEntity.setMainCategoryID(subCategoryModel.getMainCategoryID());

        this.subCategoryRepository.save(categoryEntity);
        return subCategoryModel;
    }

    @Override
    public List<SubCategoryModel> getSubCategories() {
        List<SubCategoryEntity> subCategoryEntities = this.subCategoryRepository.findAll();
        List<SubCategoryModel> subCategoryModels = subCategoryEntities
                .stream()
                .map(entity -> new SubCategoryModel(
                        entity.getId(),
                        entity.getName(),
                        entity.getDescription(),
                        null,
                        null
                ))
                .collect(Collectors.toList());
        return subCategoryModels;
    }

    @Override
    public SubCategoryModel getSubCategoryById(Long id) {
        SubCategoryModel subCategoryModel = new SubCategoryModel();
        SubCategoryEntity subCategoryEntity = subCategoryRepository.findById(id).get();

        subCategoryModel.setId(subCategoryEntity.getId());
        subCategoryModel.setName(subCategoryEntity.getName());
        subCategoryModel.setDescription(subCategoryEntity.getDescription());
        subCategoryModel.setMainCategoryID(null);

        return subCategoryModel;
    }

    @Override
    public SubCategoryModel getSubCategoryByName(String name) {
        SubCategoryModel subCategoryModel = new SubCategoryModel();
        SubCategoryEntity subCategoryEntity = this.subCategoryRepository.findByName(name);

        subCategoryModel.setId(subCategoryEntity.getId());
        subCategoryModel.setName(subCategoryEntity.getName());
        subCategoryModel.setDescription(subCategoryEntity.getDescription());
        subCategoryModel.setMainCategoryID(null);

        return subCategoryModel;
    }

    @Override
    public SubCategoryModel updateSubCategory(Long id, SubCategoryModel subCategoryModel) {
        SubCategoryEntity subCategoryEntity = this.subCategoryRepository.findById(id).get();

        subCategoryEntity.setName(subCategoryModel.getName());
        subCategoryEntity.setDescription(subCategoryModel.getDescription());
        subCategoryEntity.setMainCategoryID(subCategoryModel.getMainCategoryID());

        this.subCategoryRepository.save(subCategoryEntity);

        return subCategoryModel;
    }

    @Override
    public boolean deleteSubCategory(Long id) {
        this.subCategoryRepository.deleteById(id);
        return true;
    }
}
