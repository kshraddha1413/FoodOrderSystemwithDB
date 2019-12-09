package com.shr.foodorderapi.Services;

import java.util.List;

import com.shr.foodorderapi.DAO.FoodItemDAO;
import com.shr.foodorderapi.Model.Employee;
import com.shr.foodorderapi.Model.FoodItemDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class FoodItemServiceImpl implements FoodItemService {
	@Autowired
	private FoodItemDAO foodDAO;

	@Transactional
	@Override
	public List<FoodItemDetails> get() {

		return foodDAO.get();
	}
	
	@Transactional
	@Override
	public List<Employee> get1() {

		return foodDAO.get1();
	}

	@Transactional
	@Override
	public FoodItemDetails get(int id) {

		return foodDAO.get(id);
	}

	@Transactional
	@Override
	public void save(FoodItemDetails food) {
		foodDAO.save(food);

	}

	@Transactional
	@Override
	public void delete(int id) {
		foodDAO.delete(id);

	}

}
