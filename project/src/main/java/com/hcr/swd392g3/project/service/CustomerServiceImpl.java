package com.hcr.swd392g3.project.service;

import com.hcr.swd392g3.project.repository.CustomerRepository;
import com.hcr.swd392g3.project.service.IService.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    CustomerRepository repos;

}
