package com.example.service;

import org.springframework.stereotype.Service;

import com.example.entity.CategoryEntity;
import com.example.model.categoryRequest;

@Service
public interface IWorkoutService {
	void addCategory(categoryRequest category);
}
