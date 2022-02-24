package com.star.spring.rest.dao;


import com.star.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeDao {

    public List<Employee> getAllEmployee();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
