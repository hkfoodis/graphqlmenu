package org.zerock.graphql.model;

import java.util.List;

public class RestaurantInfo {

	private String company_code;
	private List<FoodInfo> foods;
	
	public RestaurantInfo(final String company_code, final List<FoodInfo> foods) {
		this.company_code = company_code;
		this.foods = foods;
	}
	
	public RestaurantInfo(final String company_code) {
		this.company_code = company_code;
	}
	
	public RestaurantInfo() {
		
	}
	
	public String getCompany_code() {
		return company_code;
	}
	
	public void setCompany_code(String company_code) {
		this.company_code = company_code;
	}
	
	public List<FoodInfo> getFoods(){
		return foods;
	}
	
	public void setFoods(final List<FoodInfo> foods) {
		this.foods = foods;
	}
}
