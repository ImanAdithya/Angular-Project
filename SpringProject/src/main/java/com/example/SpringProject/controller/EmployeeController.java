package com.example.SpringProject.controller;


import com.example.SpringProject.dto.EmployeeDTO;
import com.example.SpringProject.dto.EmployeeSaveDTO;
import com.example.SpringProject.dto.EmployeeUpdateDTO;
import com.example.SpringProject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save")
    public String saveEmployee(@RequestBody EmployeeSaveDTO employeeSaveDTO){
        String id=employeeService.addEmployee(employeeSaveDTO);
        return id;
    }

    @GetMapping("getAllEmployee")
    public List<EmployeeDTO> getAllEmployee(){
        List<EmployeeDTO> allEmployee=employeeService.getAllEmployee();
        return allEmployee;
    }

    @PutMapping("/update")
    public String updateEmployee(@RequestBody EmployeeUpdateDTO employeeUpdateDTO){
        String id=employeeService.updateEmployee(employeeUpdateDTO);
        return id;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable(value = "id")int id){
        boolean deleteEmployee=employeeService.deleteEmployee(id);
        return "deleted";
    }
}
