package com.hcr.swd392g3.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.hcr.swd392g3.project.service.IService.ITableService;
import com.hcr.swd392g3.project.service.IService.IWailistService;

@RestController
@RequestMapping("employee")
public class WaitlistController {

	@Autowired
    IWailistService service;
	
	@GetMapping(value = "/waitlistpage")
	public ModelAndView loadtablepage() {
		return new ModelAndView("employee-waitlistpage");
	}
}
