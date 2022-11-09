package com.acquahkingsleysegu.ecommerce_application.Repository;

import com.acquahkingsleysegu.ecommerce_application.Entity.UserEntity;
import com.acquahkingsleysegu.ecommerce_application.Model.UserEntityModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserEntityRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByUsername(String username);
}
