package com.rishi.sample.service;

import com.rishi.sample.dto.EmployeeDto;
import com.rishi.sample.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(EmployeeDto employeeDto);

    List<Employee> getAllEmployees();
}
