package org.zerock.graphql.query;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.zerock.graphql.model.FoodInfo;
import org.zerock.graphql.repository.FoodRepository;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class Query implements GraphQLQueryResolver {
	
	private final FoodRepository foodRepository;
	
	public Query(FoodRepository foodRepository) {
		this.foodRepository = foodRepository;
	}
	
	public List<FoodInfo> foods() {
		List<FoodInfo> result = new ArrayList<>();
		
		//result = foodRepository.findAll();
		
		return null;
	}
	
	public FoodInfo food(String name) {
		//return foodRepository.findFood(name);
		
		return null;
	}
}