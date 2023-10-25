package com.hcr.swd392g3.project.converter;

import org.springframework.stereotype.Component;

import com.hcr.swd392g3.project.dto.EmployeeDTO;
import com.hcr.swd392g3.project.entity.Employee;

@Component
public class EmployeeConverter {

	//convert from dto into entity
	public Employee toEntity(EmployeeDTO dto) {
		Employee entity = new Employee();
		entity.setContract(dto.getContract());
		entity.setHiredDate(dto.getHiredDate());
		entity.setSalary(dto.getSalary());
		entity.setDepartment(dto.getDepartment());
		return entity; 
	}
	
	//convert from entity into dto
	public EmployeeDTO toDTO(Employee entity) {
		EmployeeDTO dto = new EmployeeDTO();
		dto.setContract(entity.getContract());
		dto.setHiredDate(entity.getHiredDate());
		dto.setSalary(entity.getSalary());
		dto.setDepartment(entity.getDepartment());
		return dto; 
	}
	
	//convert from dto into entity
	public Employee toEntity(EmployeeDTO dto, Employee entity) {
		entity.setContract(dto.getContract());
		entity.setHiredDate(dto.getHiredDate());
		entity.setSalary(dto.getSalary());
		entity.setDepartment(dto.getDepartment());
		return entity; 
	}
}
