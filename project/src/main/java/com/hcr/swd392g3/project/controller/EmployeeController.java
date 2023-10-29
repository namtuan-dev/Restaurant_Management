package com.hcr.swd392g3.project.controller;

import com.hcr.swd392g3.project.dto.EmployeeDTO;
import com.hcr.swd392g3.project.entity.Employee;
import com.hcr.swd392g3.project.service.IService.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    IEmployeeService service;
    @GetMapping(value = "/getall")
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<List<EmployeeDTO>> (service.getAll(), HttpStatus.OK);
    }
    @PostMapping(value = "/add")
    public EmployeeDTO addEmployee(@RequestBody EmployeeDTO employeeDTO){
        return service.addEmployee(employeeDTO);
    }
    @PutMapping(value = "/update")
    public EmployeeDTO updateEmployee(@RequestBody EmployeeDTO employeeDTO){
        return service.updateEmployee(employeeDTO);
    }
    @PutMapping(value = "/ban")
    public void banEmployee(@RequestBody EmployeeDTO employeeDTO){
        service.banEmployee(employeeDTO);
    }
}
