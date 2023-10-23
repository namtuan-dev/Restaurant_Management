package com.hcr.swd392g3.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcr.swd392g3.project.service.IService.ITableService;
import com.hcr.swd392g3.project.service.IService.IWailistService;

@RestController
@RequestMapping("")
public class WaitlistController {

	@Autowired
    IWailistService service;
}
