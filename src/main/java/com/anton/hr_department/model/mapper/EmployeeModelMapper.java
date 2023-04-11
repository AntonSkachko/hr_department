package com.anton.hr_department.model.mapper;

import com.anton.hr_department.dto.EmployeeDTO;
import com.anton.hr_department.model.EmployeeModel;

public class EmployeeModelMapper {
    public static EmployeeModel mapToModel(EmployeeDTO dto) {
        return new EmployeeModel()
                .setIdEmployee(dto.getIdEmployee())
                .setFio(dto.getFio())
                .setPosition(dto.getPosition())
                .setSalary(dto.getSalary())
                .setDateOfDismissal(dto.getDateOfDismissal())
                .setContactDetails(dto.getContactDetails())
                .setDateOfEmployment(dto.getDateOfEmployment())
                .setIdEducation(dto.getIdEducation())
                .setIdDepartment(dto.getIdDepartment());
    }
}