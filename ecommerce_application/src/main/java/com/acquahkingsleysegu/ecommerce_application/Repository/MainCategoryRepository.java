package com.acquahkingsleysegu.ecommerce_application.Repository;

import com.acquahkingsleysegu.ecommerce_application.Entity.MainCategoryEntity;
import com.acquahkingsleysegu.ecommerce_application.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainCategoryRepository extends JpaRepository<MainCategoryEntity, Long> {
    MainCategoryEntity findByName(String name);
}
