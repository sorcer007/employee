package com.harare.employee.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter()
@Setter()
@ToString()
@Document(collection = "employee-1")
public class Employee {

    private int id;
    private String name;
    private int salary;
    private int age;
}
