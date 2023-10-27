package com.hcr.swd392g3.project.service;

import com.hcr.swd392g3.project.converter.EmployeeConverter;
import com.hcr.swd392g3.project.dto.EmployeeDTO;
import com.hcr.swd392g3.project.entity.Employee;
import com.hcr.swd392g3.project.repository.EmployeeRepository;
import com.hcr.swd392g3.project.service.IService.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	EmployeeRepository empRepo;
	
	@Autowired
	EmployeeConverter empConverter;

	@Override
	public EmployeeDTO findOneByID(int id) {
		Employee empEntity = empRepo.findOneByPersonID(id); System.out.println(empEntity.getEmail());
		return empConverter.toDTO(empEntity);
	}
	
	


}
