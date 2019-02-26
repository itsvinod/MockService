package com.mockservice.service;

import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mockservice.model.ResponseResultModel;


@Service
public class MockService {

	Logger logger = LoggerFactory.getLogger(MockService.class);

	public ResponseResultModel getGeoDetails() {
		ObjectMapper objectMapper = new ObjectMapper();
		ResponseResultModel rsmdl = null;
		try {
			Resource resource = new ClassPathResource("SampleResponse.json");
			String srcJsonPath = resource.getURL().getPath();
			rsmdl = objectMapper.readValue(new File(srcJsonPath), ResponseResultModel.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rsmdl;
	}

	
	/*
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
	   return builder.build();
	}
	*/
}