package com.hcr.swd392g3.project.service.IService;

import org.springframework.stereotype.Service;

import com.hcr.swd392g3.project.dto.EmployeeDTO;
import com.hcr.swd392g3.project.entity.Employee;


public interface IEmployeeService
{
	public EmployeeDTO findOneByID(int id);
}
