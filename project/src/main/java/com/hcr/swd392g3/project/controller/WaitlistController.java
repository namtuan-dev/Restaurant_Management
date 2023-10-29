package com.hcr.swd392g3.project.controller;

import com.hcr.swd392g3.project.dto.TableDTO;
import com.hcr.swd392g3.project.dto.WaitlistDTO;
import com.hcr.swd392g3.project.entity.Waitlist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.hcr.swd392g3.project.service.IService.ITableService;
import com.hcr.swd392g3.project.service.IService.IWailistService;

import java.util.List;

@RestController
@RequestMapping("waitlist")
public class WaitlistController {

	@Autowired
    IWailistService service;
    @GetMapping(value = "/getByPersonID/{id}")
    public ResponseEntity<?> getAllByPersonID(@PathVariable("id") int id){
        return new ResponseEntity<List<WaitlistDTO>>(service.getAllByPersonID(id), HttpStatus.OK);
    }
    @PostMapping(value = "/add")
    public ResponseEntity<?> updateWaitlist(@RequestBody WaitlistDTO waitlistDTO){
        service.saveWaitlist(waitlistDTO);
        return new ResponseEntity<WaitlistDTO>(waitlistDTO,HttpStatus.OK);
    }

}
