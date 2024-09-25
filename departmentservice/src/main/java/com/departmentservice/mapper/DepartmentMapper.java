package com.departmentservice.mapper;


import com.departmentservice.dto.DepartmentDto;
import com.departmentservice.model.Department;

public class DepartmentMapper {


    //convert Department Entity into Department DTO
    public static DepartmentDto mapToDepartmentDto(Department department) {
        DepartmentDto departmentDto = new DepartmentDto(
                department.getId(),
                department.getDepartmentName(),
                department.getDepartmentDescription(),
                department.getDepartmentCode()
        );
        return departmentDto;
    }

    //convert DepartmentDto into Department Entity
    public static Department mapToEntity(DepartmentDto departmentDto) {
        Department department = new Department(
                departmentDto.getId(),
                departmentDto.getDepartmentName(),
                departmentDto.getDepartmentDescription(),
                departmentDto.getDepartmentCode()
        );
        return department;
    }


}
