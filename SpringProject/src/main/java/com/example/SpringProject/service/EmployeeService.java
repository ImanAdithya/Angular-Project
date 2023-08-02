package com.example.SpringProject.service;

import com.example.SpringProject.dto.EmployeeDTO;
import com.example.SpringProject.dto.EmployeeSaveDTO;
import com.example.SpringProject.dto.EmployeeUpdateDTO;

import java.util.List;

public interface EmployeeService {
    String addEmployee(EmployeeSaveDTO employeeSaveDTO);

    List<EmployeeDTO> getAllEmployee();

    String updateEmployee(EmployeeUpdateDTO employeeUpdateDTO);

    boolean deleteEmployee(int id);
}
