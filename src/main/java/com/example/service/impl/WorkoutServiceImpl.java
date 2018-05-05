package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.dao.IWorkoutDao;
import com.example.entity.CategoryEntity;
import com.example.model.categoryRequest;
import com.example.service.IWorkoutService;
@Component("workoutService")
public class WorkoutServiceImpl implements IWorkoutService{
	
	  @Autowired
	    private IWorkoutDao workoutDao;
	    

	  
public void addCategory(categoryRequest category) {
	workoutDao.addCategory(category);
}
}
