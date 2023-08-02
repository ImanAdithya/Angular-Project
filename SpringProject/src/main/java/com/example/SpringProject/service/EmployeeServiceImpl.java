package com.example.SpringProject.service;

import com.example.SpringProject.dto.EmployeeDTO;
import com.example.SpringProject.dto.EmployeeSaveDTO;
import com.example.SpringProject.dto.EmployeeUpdateDTO;
import com.example.SpringProject.entity.Employee;
import com.example.SpringProject.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepo employeeRepo;
    @Override
    public String addEmployee(EmployeeSaveDTO employeeSaveDTO) {

        Employee emp=new Employee (
               employeeSaveDTO.getName (),
               employeeSaveDTO.getAddress (),
               employeeSaveDTO.getMobile ()
        );

        employeeRepo.save (emp);
        return emp.getName ();

    }

    @Override
    public List<EmployeeDTO> getAllEmployee() {
        List<Employee> getEmployee=employeeRepo.findAll ();
        List<EmployeeDTO> allEmp=new ArrayList<> ();

       for(Employee e:getEmployee){
           EmployeeDTO empDTO=new EmployeeDTO (
                   e.getEmployeeId (),
                   e.getName (),
                   e.getAddress (),
                   e.getMobile ()
           );
           allEmp.add (empDTO);
       }
       return  allEmp;
    }

    @Override
    public String updateEmployee(EmployeeUpdateDTO employeeUpdateDTO) {
        if(employeeRepo.existsById (employeeUpdateDTO.getEmployeeId ())){

            Employee employee = employeeRepo.getById (employeeUpdateDTO.getEmployeeId ());

            employee.setName (employeeUpdateDTO.getName ());
            employee.setAddress (employeeUpdateDTO.getAddress ());
            employee.setMobile (employeeUpdateDTO.getMobile ());

            employeeRepo.save (employee);

        }else{
            System.out.println ("Employee ID Not Found");
        }
        return null;
    }

    @Override
    public boolean deleteEmployee(int id) {

        if(employeeRepo.existsById (id)){
            employeeRepo.deleteById (id);
        }else {
            System.out.println ("Employee ID Not Found");
        }
        return true;
    }
}
