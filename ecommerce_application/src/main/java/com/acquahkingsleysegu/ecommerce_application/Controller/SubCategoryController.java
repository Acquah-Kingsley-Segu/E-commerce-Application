package com.acquahkingsleysegu.ecommerce_application.Controller;

import com.acquahkingsleysegu.ecommerce_application.Model.SubCategoryModel;
import com.acquahkingsleysegu.ecommerce_application.Service.SubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:3000")
public class SubCategoryController {

    @Autowired
    private SubCategoryService subCategoryService;

    public SubCategoryController(SubCategoryService subCategoryService) {
        this.subCategoryService = subCategoryService;
    }

    @PostMapping("/sub_category")
    public ResponseEntity<SubCategoryModel> createSubCategory(@RequestBody SubCategoryModel subCategoryModel){
        return new ResponseEntity<>(this.subCategoryService.createSubCategory(subCategoryModel), HttpStatus.OK);
    }

    @GetMapping("/sub_category")
    public ResponseEntity<List<SubCategoryModel>> getSubCategories(){
        return new ResponseEntity<>(this.subCategoryService.getSubCategories(), HttpStatus.OK);
    }

    @GetMapping("/subCategory/{id}")
    public ResponseEntity<SubCategoryModel> getSubCategoryById(@PathVariable Long id){
        return new ResponseEntity<>(this.subCategoryService.getSubCategoryById(id), HttpStatus.OK);
    }

    @GetMapping("/sub_category/{name}")
    public ResponseEntity<SubCategoryModel> getSubCategoryByName(@PathVariable String name){
        return new ResponseEntity<>(this.subCategoryService.getSubCategoryByName(name), HttpStatus.OK);
    }

    @PutMapping("/sub_category/{id}")
    public ResponseEntity<SubCategoryModel> updateSubCategory(@PathVariable Long id, @RequestBody SubCategoryModel subCategoryModel){
        return new ResponseEntity<>(this.subCategoryService.updateSubCategory(id, subCategoryModel), HttpStatus.OK);
    }

    @DeleteMapping("/sub_category/{id}")
    public ResponseEntity<Boolean> deleteCategory(@PathVariable Long id){
        return new ResponseEntity<>(this.subCategoryService.deleteSubCategory(id), HttpStatus.OK);
    }
}
