package com.acquahkingsleysegu.ecommerce_application.Repository;

import com.acquahkingsleysegu.ecommerce_application.Entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<ItemEntity, Long> {
    ItemEntity findByName(String name);
}
