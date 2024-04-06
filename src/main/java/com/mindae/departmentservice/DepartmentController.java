package com.mindae.departmentservice;

import com.mindae.departmentservice.client.EmployeeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    private final EmployeeClient employeeClient;

    @Autowired
    public DepartmentController(EmployeeClient employeeClient) {
        this.employeeClient = employeeClient;
    }

    @GetMapping("/departments")
    String getDepartments() {
        String employees = employeeClient.getEmployees();
        return "department list" + employees;
    }
}
