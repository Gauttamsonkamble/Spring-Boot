package com.example.Nalini.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.Nalini.model.employee;

public interface EmployeeRepo extends CrudRepository<employee, Integer>
{

}
