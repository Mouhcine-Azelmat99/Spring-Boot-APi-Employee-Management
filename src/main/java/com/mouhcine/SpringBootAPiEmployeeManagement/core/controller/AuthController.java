package com.mouhcine.SpringBootAPiEmployeeManagement.core.controller;

import com.mouhcine.SpringBootAPiEmployeeManagement.core.bo.User;
import com.mouhcine.SpringBootAPiEmployeeManagement.core.config.JwtService;
import com.mouhcine.SpringBootAPiEmployeeManagement.core.model.AuthRequest;
import com.mouhcine.SpringBootAPiEmployeeManagement.core.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(("/api/auth"))
@CrossOrigin(origins = "*")
public class AuthController {

    @Autowired
    private IUserService userService;

    @PostMapping(value = "login")
    public String authenticateAndGetToken(@RequestBody AuthRequest authRequest) {
//        Map<String,String> map = new HashMap<>();
//        map.put("token",userService.login(authRequest))
        return userService.login(authRequest);
    }

    @PostMapping("register")
    public String addNewUser(@RequestBody User user) {
        return userService.save(user);
    }
}
