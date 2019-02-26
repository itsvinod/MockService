package com.mockservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mockservice.model.ResponseResultModel;
import com.mockservice.service.MockService;

@RestController
public class MockController {

	Logger logger = LoggerFactory.getLogger(MockController.class);
	
	@Autowired 
	MockService mockService;
	
	@PostMapping(path = "/mockserive")
	//public ResponseEntity<ResponseResultModel> getGeoDetails() {
	public ResponseResultModel getGeoDetails() {
		return mockService.getGeoDetails();
	}

}