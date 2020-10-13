package org.zerock.graphql.query;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.graphql.entity.Food;
import org.zerock.graphql.model.FoodInfo;
import org.zerock.graphql.model.RestaurantInfo;
import org.zerock.graphql.repository.FoodRepository;

@Service
public class FoodService {

	@Autowired
	private FoodRepository foodRepository;
	
	public List<FoodInfo> foods(String code){
		List<FoodInfo> foodsInfo = new ArrayList<>();
		List<Food> foods = new ArrayList<>();
		foods = foodRepository.findbyCompany_code(code);
		
		for(int i=0; i<foods.size(); i++) {
			foodsInfo.add(new FoodInfo(foods.get(i), new RestaurantInfo(code)));
		}
		
		return foodsInfo;
	}
}
