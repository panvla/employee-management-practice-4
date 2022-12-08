package com.vladimirpandurov.employee_management_app_4.repository;

import com.vladimirpandurov.employee_management_app_4.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,  Long> {

}
