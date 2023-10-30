package com.hcr.swd392g3.project.controller;

import com.hcr.swd392g3.project.dto.EmployeeDTO;

import com.hcr.swd392g3.project.entity.Employee;

import com.hcr.swd392g3.project.dto.TableDTO;

import com.hcr.swd392g3.project.service.IService.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping("manager")
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


    @GetMapping(value = "/employeepage")
   	public ModelAndView loadtablepage() {
   		return new ModelAndView("manager-employeepage");
   	}
    
    @GetMapping(value = "/employee/{id}")
	public ResponseEntity<?> getEmployeeID(@PathVariable("id") int id) {
		return new ResponseEntity<EmployeeDTO>(service.findOneByID(id), HttpStatus.OK);
	}

}
