package com.hcr.swd392g3.project.service.IService;

import com.hcr.swd392g3.project.dto.EmployeeDTO;
import com.hcr.swd392g3.project.dto.PersonDTO;
import com.hcr.swd392g3.project.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IEmployeeService
{
    List<EmployeeDTO> getAll();

    EmployeeDTO updateEmployee(EmployeeDTO employeeDTO);
    void banEmployee(EmployeeDTO employeeDTO);
    EmployeeDTO addEmployee( EmployeeDTO employeeDTO);

}
