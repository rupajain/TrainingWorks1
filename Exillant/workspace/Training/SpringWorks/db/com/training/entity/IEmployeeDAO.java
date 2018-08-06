package com.training.entity;

import java.util.List;

import javax.sql.DataSource;



public interface IEmployeeDAO {
public Employee getEmployee(int empId);
public List<Employee> getAllEmps();
public void insertEmployee(Employee employee);

public void deleteEmployee(int empId);

public void updateEmployee(int empId,double empNewSalary);

public void setDataSource(DataSource dataSource);
}

