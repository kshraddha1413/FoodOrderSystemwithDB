package com.shr.foodorderapi.Services;

import java.util.List;

import com.shr.foodorderapi.Model.Employee;
import com.shr.foodorderapi.Model.FoodItemDetails;

public interface FoodItemService {
	List<FoodItemDetails> get();
	
	List<Employee> get1();

	FoodItemDetails get(int id);

	void save(FoodItemDetails food);

	void delete(int id);

}
