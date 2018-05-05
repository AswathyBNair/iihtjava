package com.example.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.CategoryEntity;
import com.example.model.categoryRequest;
import com.example.service.IWorkoutService;

@RestController
public class WorkoutController {
	
	@Autowired
	IWorkoutService workOutService;
	
	private HttpServletResponse servletResponse;

	private void allowCrossDomainAccess() {
	    if (servletResponse != null) {
	        servletResponse.setHeader("Access-Control-Allow-Origin", "*");
	    }
	}
	
	
	@CrossOrigin(origins = "http://localhost:4200",exposedHeaders="Access-Control-Allow-Origin")
	@RequestMapping(value="/addCategory",method = RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	public void addCategory(@RequestBody categoryRequest category) {
		allowCrossDomainAccess();  
		System.out.println("hiii");
		workOutService.addCategory(category);
	}

}
