package com.ezen.springmvc.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cook {
	@Autowired
	Food food;
	@Autowired
	Dish dish;
	
	@Override
	public String toString() {
		return String.format("%s/%s", food, dish);
	}
}
