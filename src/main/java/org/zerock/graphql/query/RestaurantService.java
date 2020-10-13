package org.zerock.graphql.query;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.graphql.entity.Food;
import org.zerock.graphql.model.FoodInfo;
import org.zerock.graphql.model.RestaurantInfo;

@Service
public class RestaurantService {

	@Autowired
	private FoodService foodService;
	
	public List<FoodInfo> foods = new ArrayList<>();
	
	public RestaurantService(FoodService foodService) {
	}
	
	public RestaurantInfo lookupRestaurant(String code) {
		foods = foodService.foods(code);
		RestaurantInfo restaurant1 = new RestaurantInfo(code);
		restaurant1.setFoods(foods.stream()
				.filter(food -> food.getRestaurantInfo().getCompany_code().equals(restaurant1.getCompany_code()))
				.collect(Collectors.toList()));
		
		return restaurant1;
	}
} 
