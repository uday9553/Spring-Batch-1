package com.Uday.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Uday.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
