package com.hcr.swd392g3.project.controller;

import com.hcr.swd392g3.project.dto.CustomerDTO;
import com.hcr.swd392g3.project.dto.PersonDTO;
import com.hcr.swd392g3.project.service.IService.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class CustomerController {

    @Autowired
    ICustomerService service;


    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ResponseEntity<?> saveUser(@RequestBody CustomerDTO user) throws Exception {
        return ResponseEntity.ok(service.saveCustomer(user));
    }

}
