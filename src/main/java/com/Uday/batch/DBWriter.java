package com.Uday.batch;
import com.Uday.model.*;
import com.Uday.repository.*;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBWriter implements ItemWriter<Employee> {

    private EmployeeRepository employeeRepository;

    @Autowired
    public DBWriter (EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void write(List<? extends Employee> employees) throws Exception{
        System.out.println("Data Saved for Users: " + employees);
        employeeRepository.saveAll(employees);
    }
}