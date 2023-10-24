package com.hcr.swd392g3.project.controller;


import com.hcr.swd392g3.project.converter.TableConverter;
import com.hcr.swd392g3.project.dto.TableDTO;
import com.hcr.swd392g3.project.entity.Table;
import com.hcr.swd392g3.project.service.IService.ITableService;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("employee")
public class TableController {

    @Autowired
    ITableService tableService;
    
    @Autowired
	private TableConverter tableConverter;
    
    @GetMapping(value = "/table")
	public ModelAndView getAllTable() {
		return new ModelAndView("employee-tablepage");
	}
    
//    @GetMapping(value = "/customer")
//	public ResponseEntity<?> getAllTable() {
//		return new ResponseEntity<List<TableDTO>>(tableService.getAllTable(), HttpStatus.OK);
//	}
    
    @PostMapping(value = "/table")
    public TableDTO createTable ( @Valid @RequestBody Table customer){
		return tableService.saveTable(tableConverter.toDTO(customer));
    }
    
    @PutMapping(value = "/table")
	public TableDTO updateTable( @RequestBody TableDTO model) {
		return tableService.updateTable(model);
	}
    
    @DeleteMapping(value = "/table/{id}")
	public void deleteTable(@PathVariable("id") int id) {
//		tableService.delete((UUID) id);
	}
}
