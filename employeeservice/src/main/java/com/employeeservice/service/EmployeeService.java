package com.employeeservice.service;

import com.employeeservice.dto.ApiResponseDto;
import com.employeeservice.dto.EmployeeDto;

public interface EmployeeService {

    //create employee
    public EmployeeDto createEmployee(EmployeeDto employeeDto);

    //get employee by id
    //public EmployeeDto getEmployeeById(Long employeeId);

    //get employee by id
    public ApiResponseDto getEmployeeById(Long employeeId);


}
