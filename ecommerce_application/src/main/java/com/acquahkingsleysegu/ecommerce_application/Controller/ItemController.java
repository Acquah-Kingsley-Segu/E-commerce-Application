package com.acquahkingsleysegu.ecommerce_application.Controller;

import com.acquahkingsleysegu.ecommerce_application.Model.ItemModel;
import com.acquahkingsleysegu.ecommerce_application.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ItemController {
    @Autowired
    private ItemService service;

    public ItemController(ItemService itemService){
        this.service = itemService;
    }

    @PostMapping("/item")
    public ResponseEntity<ItemModel> createItemModel(@RequestBody ItemModel itemModel){
        return new ResponseEntity<>(this.service.createItem(itemModel), HttpStatus.OK);
    }

    @GetMapping("/item")
    public ResponseEntity<List<ItemModel>> getItems(){
        return new ResponseEntity<>(this.service.getItems(), HttpStatus.OK);
    }

    @GetMapping("/item/{id}")
    public ResponseEntity<ItemModel> getItemById(@PathVariable Long id){
        return new ResponseEntity<>(this.service.getItemById(id), HttpStatus.OK);
    }

    @GetMapping("/Item/{name}")
    public ResponseEntity<ItemModel> getItemByName(@PathVariable String name){
        return new ResponseEntity<>(this.service.getItemByName(name), HttpStatus.OK);
    }

    @PutMapping("/item/{id}")
    public ResponseEntity<ItemModel> updateItem(@PathVariable Long id, @RequestBody ItemModel itemModel){
        return new ResponseEntity<>(this.service.updateItem(id, itemModel), HttpStatus.OK);
    }

    @DeleteMapping("/item/{id}")
    public ResponseEntity<Boolean> deleteItem(@PathVariable Long id){
        return new ResponseEntity<Boolean>(this.service.deleteItem(id), HttpStatus.OK);
    }
}
