package com.mouhcine.SpringBootAPiEmployeeManagement.core.bo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Employee {
    @Id
    @GeneratedValue(generator = "increment")
    private Long Id;
    private String fullName;
    private String email;
    private String phoneNumber;
    private int age;
}
