package com.example.Service;

import com.example.Employee.Employee;

import java.util.List;

public interface IEmployeeService {
    public void create(Employee employee);
    public List<Employee> list();
    public void delete(Long id);

}