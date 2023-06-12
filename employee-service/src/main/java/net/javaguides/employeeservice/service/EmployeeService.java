package net.javaguides.employeeservice.service;

import net.javaguides.employeeservice.dto.EmployeeDto;
import org.springframework.stereotype.Service;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);
}
