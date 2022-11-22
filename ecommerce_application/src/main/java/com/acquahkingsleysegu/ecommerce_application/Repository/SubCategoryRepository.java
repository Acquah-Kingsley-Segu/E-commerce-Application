package com.acquahkingsleysegu.ecommerce_application.Repository;

import com.acquahkingsleysegu.ecommerce_application.Entity.SubCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubCategoryRepository extends JpaRepository<SubCategoryEntity, Long> {
    SubCategoryEntity findByName(String name);
}
