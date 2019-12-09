package com.shr.foodorderapi.DAO;

import java.util.List;

import com.shr.foodorderapi.Model.Employee;
import com.shr.foodorderapi.Model.FoodItemDetails;

public interface FoodItemDAO {
	List<FoodItemDetails> get();
	
	List<Employee> get1();

	FoodItemDetails get(int id);

	void save(FoodItemDetails food);

	void delete(int id);

}
