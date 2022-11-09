package com.acquahkingsleysegu.ecommerce_application.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntityModel {
    private Long userId;
    private String name;
    private String username;
    private String email;
    private String password;
    private String status;
}
