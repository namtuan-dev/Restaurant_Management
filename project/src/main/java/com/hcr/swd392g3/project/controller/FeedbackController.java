package com.hcr.swd392g3.project.controller;

import com.hcr.swd392g3.project.service.IService.IFeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
public class FeedbackController {

    @Autowired
    IFeedbackService service;
}
