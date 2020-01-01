package com.shr.foodorderapi.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shr.foodorderapi.Model.FoodItemDetails;

@Repository
public class FoodItemDAOImpl implements FoodItemDAO {
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<FoodItemDetails> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<FoodItemDetails> query = currentSession.createQuery("from FoodItemDetails", FoodItemDetails.class);
		List<FoodItemDetails> list = query.getResultList();
		return list;
	}

	
	@Override
	public FoodItemDetails get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		FoodItemDetails foodObj = currentSession.get(FoodItemDetails.class, id);
		return foodObj;
	}

	@Override
	public void save(FoodItemDetails food) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(food);

	}

	@Override
	public void delete(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		FoodItemDetails foodObj = currentSession.get(FoodItemDetails.class, id);
		currentSession.delete(foodObj);
	}

}
