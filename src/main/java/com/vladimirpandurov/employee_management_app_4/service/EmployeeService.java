package com.vladimirpandurov.employee_management_app_4.service;

import com.vladimirpandurov.employee_management_app_4.repository.EmployeeRepo;

public class EmployeeService {

    private final EmployeeRepo employeeRepo;


    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }
}
