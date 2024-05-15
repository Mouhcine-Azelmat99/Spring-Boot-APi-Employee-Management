package com.mouhcine.SpringBootAPiEmployeeManagement.core.model;

import com.mouhcine.SpringBootAPiEmployeeManagement.core.bo.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthRequest {

    private String username;
    private String password;


    private Role role =Role.USER;

}
