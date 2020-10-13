package org.zerock.graphql.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "food")
public class Food implements Serializable {

	private static final long serialVersionUID = -1000119078147252957L;
	
	@Id
	@Column(name = "Food_number", nullable = false)
	private int food_number;
	
	@Column(name = "Company_code", length = 20, nullable = false)
	private String company_code;
	
	@Column(name = "Food_price", nullable = false)
	private int food_price;
	
	@Column(name = "Food_name", length = 100, nullable = false)
	private String food_name;
	
	public Food(final int food_number, final String food_name, final int food_price, final String company_code) {
		this.food_number = food_number;
		this.food_name = food_name;
		this.food_price = food_price;
		this.company_code = company_code;
	}
	
	public Food() {
		
	}
	
	public int getFood_number() {
		return food_number;
	}
	
	public void setFood_number(int food_number) {
		this.food_number = food_number;
	}
	
	public String getCompany_code() {
		return company_code;
	}
	
	public void setCompany_code(String comapny_code) {
		this.company_code = company_code;
	}
	
	public int getFood_price() {
		return food_price;
	}
	
	public void setFood_price(int food_pricie) {
		this.food_price = food_price;
	}
	
	public String getFood_name() {
		return food_name;
	}
	
	public void setFood_name(String food_name) {
		this.food_name = food_name;
	}
}
