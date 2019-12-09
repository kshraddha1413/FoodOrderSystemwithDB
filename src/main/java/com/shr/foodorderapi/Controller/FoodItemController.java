package com.shr.foodorderapi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shr.foodorderapi.Model.FoodItemDetails;
import com.shr.foodorderapi.Services.FoodItemService;


@RestController
@RequestMapping("/api")
public class FoodItemController {
	@Autowired
	private FoodItemService foodService;

	@PostMapping("/fooditem")
	public FoodItemDetails save(@RequestBody FoodItemDetails foodObj) {
		foodService.save(foodObj);
		return foodObj;
	}

	@GetMapping("/fooditem")
	public List<FoodItemDetails> get() {
		return foodService.get();
	}
	
	

	@GetMapping("/fooditem/{id}")
	public FoodItemDetails get(@PathVariable int id) {
		FoodItemDetails detailObj = foodService.get(id);
		if (detailObj == null) {
			throw new RuntimeException("Fooditem not found for the Id:" + id);
		}
		return detailObj;
	}

	@PutMapping("/fooditem")
	public FoodItemDetails update(@RequestBody FoodItemDetails detailObj) {
		foodService.save(detailObj);
		return detailObj;
	}

	@DeleteMapping("/fooditem/{id}")
	public String delete(@PathVariable int id) {
		foodService.delete(id);
		return "FoodItem has been deleted with id:" + id;
	}

}
