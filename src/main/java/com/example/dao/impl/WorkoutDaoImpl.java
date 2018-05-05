package com.example.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.entity.CategoryEntity;
import com.example.model.categoryRequest;
import com.example.repository.WorkOutRepository;

@Component("workoutDao")
public class WorkoutDaoImpl {
	
	@Autowired
	WorkOutRepository workOutRepository;
public void addCategory(categoryRequest category) {
	CategoryEntity entity = new CategoryEntity();
	entity.setName(category.getCategory_name());
	workOutRepository.saveAndFlush(entity);
}
}
