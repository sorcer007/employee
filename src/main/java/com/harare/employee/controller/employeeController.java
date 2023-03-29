package com.harare.employee.controller;

import com.harare.employee.model.Employee;
import com.harare.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class employeeController {

    @Autowired
    EmployeeService service;

    @GetMapping(path="/healthCheck")
    public String healthCheck(){
        return "Employee Service is working.";
    }

    @PostMapping(path = "/employee-add",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public String employeeSave(@RequestBody Employee e){
        System.out.println(e.toString());
        service.save(e);
        return e.toString();
    }

}
