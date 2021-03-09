package com.Uday.batch;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.Uday.model.Employee;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


@Component
public class Processor implements ItemProcessor<Employee, Employee> {

    private static final Map<String, String> DEPT_NAMES =
            new HashMap<>();

    public Processor() {
        DEPT_NAMES.put("001", "Technology");
        DEPT_NAMES.put("002", "Operations");
        DEPT_NAMES.put("003", "Accounts");
    }

    @Override
    public Employee process(Employee employee) throws Exception {
        String deptCode = employee.getDept();
        String dept = DEPT_NAMES.get(deptCode);
        employee.setDept(dept);
        employee.setTime(new Date());
        System.out.println(String.format("Converted from [%s] to [%s]", deptCode, dept));
        return employee;
    }
}