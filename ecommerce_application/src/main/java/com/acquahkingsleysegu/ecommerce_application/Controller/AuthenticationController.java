package com.acquahkingsleysegu.ecommerce_application.Controller;

import com.acquahkingsleysegu.ecommerce_application.Entity.UserEntity;
import com.acquahkingsleysegu.ecommerce_application.Model.MainCategoryModel;
import com.acquahkingsleysegu.ecommerce_application.Model.UserEntityModel;
import com.acquahkingsleysegu.ecommerce_application.Service.MainCategoryService;
import com.acquahkingsleysegu.ecommerce_application.Service.UserEntityService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/v1/")
public class AuthenticationController {
    private UserEntityService userService;

    public AuthenticationController(UserEntityService userService) {
        this.userService = userService;
    }
    @PostMapping("/create_account")
    public ResponseEntity<UserEntityModel> createUser(@RequestBody UserEntityModel userInfo){
        this.userService.createUser(userInfo);
        return new ResponseEntity<>(userInfo, HttpStatus.OK);
    }

    @GetMapping("/login/{username}")
    public ResponseEntity<UserEntityModel> getUser(@PathVariable String username){
        return new ResponseEntity<>(userService.getUser(username), HttpStatus.OK);
    }
}
