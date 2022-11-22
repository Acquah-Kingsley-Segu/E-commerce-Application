package com.acquahkingsleysegu.ecommerce_application.Service;

import com.acquahkingsleysegu.ecommerce_application.Model.ItemModel;
import com.acquahkingsleysegu.ecommerce_application.Model.SubCategoryModel;

import java.util.List;

public interface ItemService {
    ItemModel createItem(ItemModel item);
    List<ItemModel> getItems();
    ItemModel getItemById(Long id);
    ItemModel getItemByName(String name);
    ItemModel updateItem(Long id, ItemModel subCategoryModel);
    boolean deleteItem(Long id);
}
