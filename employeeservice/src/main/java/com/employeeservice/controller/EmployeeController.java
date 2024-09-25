package com.employeeservice.controller;

import com.employeeservice.dto.ApiResponseDto;
import com.employeeservice.dto.EmployeeDto;
import com.employeeservice.service.EmployeeService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
@AllArgsConstructor
public class EmployeeController {


    private EmployeeService employeeService;


    //Build create employee Rest API
    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto) {
        EmployeeDto saveEmployee = employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(saveEmployee, HttpStatus.CREATED);
    }

    //get employee by id Rest API
    /*
    @GetMapping("/{employeeId}")
    public ResponseEntity<EmployeeDto> getEmployeeId(@PathVariable Long employeeId) {
        EmployeeDto employeeById = employeeService.getEmployeeById(employeeId);
        return new ResponseEntity<>(employeeById,HttpStatus.OK);
    }
    */

    @GetMapping("/{employeeId}")
    public ResponseEntity<ApiResponseDto> getEmployeeId(@PathVariable Long employeeId) {
        ApiResponseDto employeeById = employeeService.getEmployeeById(employeeId);
        return new ResponseEntity<>(employeeById,HttpStatus.OK);
    }

}
