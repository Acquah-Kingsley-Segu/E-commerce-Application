package com.acquahkingsleysegu.ecommerce_application.Controller;

import com.acquahkingsleysegu.ecommerce_application.Model.MainCategoryModel;
import com.acquahkingsleysegu.ecommerce_application.Service.MainCategoryService;
import org.jboss.jandex.Main;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class MainCategoryController {
    private MainCategoryService mainCategoryService;

    public MainCategoryController(MainCategoryService mainCategoryService) {
        this.mainCategoryService = mainCategoryService;
    }

    @PostMapping("/main_category")
    public ResponseEntity<MainCategoryModel> createCategory(@RequestBody MainCategoryModel category){
        this.mainCategoryService.createCategory(category);
        return new ResponseEntity<>(category, HttpStatus.OK);
    }

    @GetMapping("/main_category")
    public ResponseEntity<List<MainCategoryModel>> getCategories(){
        return new ResponseEntity<>(this.mainCategoryService.getCategories(), HttpStatus.OK);
    }

    @GetMapping("/main_category/{name}")
    public ResponseEntity<MainCategoryModel> getCategoryByName(@PathVariable String name){
        return new  ResponseEntity<>(this.mainCategoryService.getCategoryByName(name), HttpStatus.OK);
    }

    @GetMapping("/mainCategory/{id}")
    public ResponseEntity<MainCategoryModel> getCategoryByID(@PathVariable Long id){
        return new ResponseEntity<>(this.mainCategoryService.getCategoryById(id), HttpStatus.OK);
    }

    @PutMapping("/main_category/{id}")
    public ResponseEntity<MainCategoryModel> updateCategory(@PathVariable Long id, @RequestBody MainCategoryModel category){
        return new ResponseEntity<>(this.mainCategoryService.updateCategory(id, category), HttpStatus.OK);
    }

    @DeleteMapping("/main_category/{id}")
    public ResponseEntity<Boolean> deleteCategory(@PathVariable Long id){
        return new ResponseEntity<>(this.mainCategoryService.deleteCategory(id), HttpStatus.OK);
    }
}
