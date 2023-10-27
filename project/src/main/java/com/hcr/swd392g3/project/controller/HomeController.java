package com.hcr.swd392g3.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.hcr.swd392g3.project.service.IService.IMenuService;

@CrossOrigin
@RestController
@RequestMapping("home")
public class HomeController {

	@Autowired
    IMenuService menuService;
    
    @Autowired
	private MenuController mennuConverter;
    
    
    @GetMapping(value = "")
	public ModelAndView loadtablepage() {
		return new ModelAndView("homepage");
	}
}
