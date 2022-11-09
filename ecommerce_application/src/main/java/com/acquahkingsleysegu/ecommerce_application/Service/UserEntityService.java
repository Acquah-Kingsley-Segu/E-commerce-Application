package com.acquahkingsleysegu.ecommerce_application.Service;

import com.acquahkingsleysegu.ecommerce_application.Entity.UserEntity;
import com.acquahkingsleysegu.ecommerce_application.Model.UserEntityModel;

public interface UserEntityService {
    UserEntityModel createUser(UserEntityModel user);
    UserEntityModel getUser(String username);
}
