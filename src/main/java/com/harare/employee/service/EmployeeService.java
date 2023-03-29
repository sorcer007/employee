package com.harare.employee.service;

import com.harare.employee.model.Employee;
import com.harare.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository repository;
    public void save(Employee e) {
        repository.save(e);
    }
}
