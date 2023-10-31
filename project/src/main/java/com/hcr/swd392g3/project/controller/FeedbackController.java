package com.hcr.swd392g3.project.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.hcr.swd392g3.project.converter.FeedbackConverter;
import com.hcr.swd392g3.project.dto.FeedbackDTO;
import com.hcr.swd392g3.project.entity.Feedback;
import com.hcr.swd392g3.project.service.IService.IFeedbackService;

@RestController
@RequestMapping("customer")
public class FeedbackController {

  @Autowired
  IFeedbackService service;

  @Autowired
  private FeedbackConverter feedbackConverter;

   @GetMapping(value = "/feedback")
	public ModelAndView loadFeeback() {
		return new ModelAndView("customer-feedback");
	}

  // insert table
    //@modelatribute use for content-type mutipart/form-data
    @PostMapping(value = "/feeback")
    public FeedbackDTO createFeedback ( @ModelAttribute @Valid @RequestBody Feedback feeback){
		return service.saveFeedback(feedbackConverter.toDTO(feeback));
    }
    
    //update table
    @PutMapping(value = "/feedback")
	public FeedbackDTO updateFeedback( @RequestBody FeedbackDTO model) {
		return service.updateFeedback(model);
	}
}