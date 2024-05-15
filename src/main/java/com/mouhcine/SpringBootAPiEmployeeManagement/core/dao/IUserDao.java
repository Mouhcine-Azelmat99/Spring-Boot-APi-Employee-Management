package com.mouhcine.SpringBootAPiEmployeeManagement.core.dao;

import com.mouhcine.SpringBootAPiEmployeeManagement.core.bo.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IUserDao extends JpaRepository<User,Long> {
    public Optional<User> findByEmail(String email);
}
