package com.acquahkingsleysegu.ecommerce_application.Service;

import com.acquahkingsleysegu.ecommerce_application.Entity.UserEntity;
import com.acquahkingsleysegu.ecommerce_application.Model.UserEntityModel;
import com.acquahkingsleysegu.ecommerce_application.Repository.UserEntityRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("user-service")
public class UserEntityServiceImp implements UserEntityService{


    @Autowired
    UserEntityRepository userEntityRepository;

    public UserEntityServiceImp(UserEntityRepository userEntityRepository) {
        this.userEntityRepository = userEntityRepository;
    }

    @Override
    public UserEntityModel createUser(UserEntityModel user) {
        UserEntity userEntity = new UserEntity();

        BeanUtils.copyProperties(user, userEntity);
        this.userEntityRepository.save(userEntity);

        return user;
    }

    @Override
    public UserEntityModel getUser(String username) {
        UserEntityModel userModel = new UserEntityModel();
        UserEntity user = this.userEntityRepository.findByUsername(username);
        BeanUtils.copyProperties(user, userModel);
        return userModel;
    }
}
