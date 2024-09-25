package com.employeeservice.mapper;


import com.employeeservice.dto.EmployeeDto;
import com.employeeservice.model.Employee;

public class EmployeeMapper {

    //convert Employee Entity into EmployeeDto
    public static EmployeeDto mapToEmployeeDto(Employee employee) {
        EmployeeDto employeeDto = new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail(),
                employee.getDepartmentCode()
        );
        return employeeDto;
    }

    //convert EmployeeDto into Employee Entity
    public static Employee mapToEntity(EmployeeDto employeeDto) {
        Employee employee = new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail(),
                employeeDto.getDepartmentCode()
        );
        return employee;
    }

}
