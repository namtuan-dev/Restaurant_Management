package com.hcr.swd392g3.project.service;

import com.hcr.swd392g3.project.converter.EmployeeConverter;
import com.hcr.swd392g3.project.dto.EmployeeDTO;
import com.hcr.swd392g3.project.dto.PersonDTO;
import com.hcr.swd392g3.project.entity.Employee;
import com.hcr.swd392g3.project.entity.Person;
import com.hcr.swd392g3.project.repository.EmployeeRepository;
import com.hcr.swd392g3.project.repository.PersonRepository;
import com.hcr.swd392g3.project.service.IService.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    EmployeeConverter employeeConverter;
    @Autowired
    PersonRepository personRepository;

    @Override
    public List<EmployeeDTO> getAll() {
        List<EmployeeDTO> list = new ArrayList<>();
        List<Employee> employees= employeeRepository.findAll();
        for (Employee employee: employees){
            list.add(employeeConverter.toDTO(employee));
        }
        return list;
    }

    @Override
    public EmployeeDTO updateEmployee(EmployeeDTO employeeDTO) {
        Employee employee= employeeRepository.getByPersonID(employeeDTO.getPersonID());
        employee.setContract(employeeDTO.getContract());
        employee.setDepartment(employeeDTO.getDepartment());
        employee.setSalary(employeeDTO.getSalary());
        employeeRepository.save(employee);
        return employeeDTO;
    }

    @Override
    public void banEmployee(EmployeeDTO employeeDTO) {
        Person person = personRepository.getByPersonID(employeeDTO.getPersonID());
        person.setStatus(false);
        personRepository.save(person);
    }

    @Override
    public EmployeeDTO addEmployee( EmployeeDTO employeeDTO) {

        Employee employee= employeeConverter.toEntity(employeeDTO);
        Person person= personRepository.getByPersonID(employeeDTO.getPersonID());
        person.setRole(2);
        personRepository.save(person);
        employeeRepository.save(employee);
        return employeeDTO;
    }
}
