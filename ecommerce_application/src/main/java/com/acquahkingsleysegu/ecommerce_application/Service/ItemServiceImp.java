package com.acquahkingsleysegu.ecommerce_application.Service;

import com.acquahkingsleysegu.ecommerce_application.Entity.ItemEntity;
import com.acquahkingsleysegu.ecommerce_application.Model.ItemModel;
import com.acquahkingsleysegu.ecommerce_application.Model.SubCategoryModel;
import com.acquahkingsleysegu.ecommerce_application.Repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemServiceImp implements ItemService{
    @Autowired
    ItemRepository repository;

    public ItemServiceImp(ItemRepository itemRepository){
        this.repository = itemRepository;
    }

    @Override
    public ItemModel createItem(ItemModel item) {
        ItemEntity itemEntity = new ItemEntity();

        itemEntity.setName(item.getName());
        itemEntity.setDescription(item.getDescription());
        itemEntity.setPrice(item.getPrice());
        itemEntity.setQty(item.getQty());
        itemEntity.setSubCategoryEntity(item.getSubCategoryEntity());

        this.repository.save(itemEntity);

        return item;
    }

    @Override
    public List<ItemModel> getItems() {
        List<ItemEntity> itemEntities = this.repository.findAll();
        List<ItemModel> itemModels = itemEntities
                .stream()
                .map(entity -> new ItemModel(
                        entity.getId(),
                        entity.getName(),
                        entity.getDescription(),
                        entity.getPrice(),
                        entity.getQty(),
                        null
                ))
                .collect(Collectors.toList());
        return itemModels;
    }

    @Override
    public ItemModel getItemById(Long id) {
        ItemModel itemModel = new ItemModel();
        ItemEntity itemEntity = this.repository.findById(id).get();

        itemModel.setId(itemEntity.getId());
        itemModel.setName(itemEntity.getName());
        itemModel.setDescription(itemEntity.getDescription());
        itemModel.setPrice(itemEntity.getPrice());
        itemModel.setQty(itemEntity.getQty());
        itemModel.setSubCategoryEntity(null);

        return itemModel;
    }

    @Override
    public ItemModel getItemByName(String name) {
        ItemModel itemModel = new ItemModel();
        ItemEntity itemEntity = this.repository.findByName(name);

        itemModel.setId(itemEntity.getId());
        itemModel.setName(itemEntity.getName());
        itemModel.setDescription(itemEntity.getDescription());
        itemModel.setPrice(itemEntity.getPrice());
        itemModel.setQty(itemEntity.getQty());
        itemModel.setSubCategoryEntity(null);

        return itemModel;
    }

    @Override
    public ItemModel updateItem(Long id, ItemModel itemModel) {
        ItemEntity itemEntity = this.repository.findById(id).get();

        itemEntity.setId(itemModel.getId());
        itemEntity.setName(itemModel.getName());
        itemEntity.setDescription(itemModel.getDescription());
        itemEntity.setPrice(itemModel.getPrice());
        itemEntity.setQty(itemModel.getQty());
        itemEntity.setSubCategoryEntity(itemModel.getSubCategoryEntity());

        this.repository.save(itemEntity);

        return itemModel;
    }

    @Override
    public boolean deleteItem(Long id) {
        boolean success = false;
        ItemEntity itemEntity = this.repository.findById(id).get();
        if(itemEntity != null)
        {
            this.repository.deleteById(id);
            return !success;
        }
        return success;
    }
}
