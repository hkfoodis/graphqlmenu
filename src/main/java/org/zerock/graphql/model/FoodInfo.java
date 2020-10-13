package org.zerock.graphql.model;

import org.zerock.graphql.entity.Food;

public class FoodInfo {

	private int food_number;
	private String food_name;
	private int food_price;
	private RestaurantInfo restaurant;
	
	public FoodInfo(Food food, final RestaurantInfo restaurant) {
		this.food_number = food.getFood_number();
		this.food_name = food.getFood_name();
		this.food_price = food.getFood_price();
		this.restaurant = restaurant;
	}
	
	public FoodInfo(Food food) {
		this.food_number = food.getFood_number();
		this.food_name = food.getFood_name();
		this.food_price = food.getFood_price();
	}
	
	public FoodInfo() {
		
	}
	
	public int getFood_number() {
		return food_number;
	}
	
	public void setFood_number(int food_number) {
		this.food_number = food_number;
	}
	
	public String getFood_name() {
		return food_name;
	}
	
	public void setFood_name(String food_name) {
		this.food_name = food_name;
	}
	
	public int getFood_price() {
		return food_price;
	}
	
	public void setFood_price(int food_price) {
		this.food_price = food_price;
	}
	
	public RestaurantInfo getRestaurantInfo() {
		return restaurant;
	}
	
	public void setRestaurantInfo(RestaurantInfo restaurant) {
		this.restaurant = restaurant;
	}
}
