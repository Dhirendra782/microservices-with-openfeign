package com.departmentservice.service;


import com.departmentservice.dto.DepartmentDto;

public interface DepartmentService {

    //create department
    public DepartmentDto createDepartment(DepartmentDto departmentDto);

    //get department by department code
    public DepartmentDto getDepartmentByCode(String departmentCode);



}
