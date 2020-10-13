package org.zerock.graphql.repository;

import java.util.List;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.zerock.graphql.entity.Food;

@Transactional
@Repository
public class FoodRepository {

	@Autowired
    private SessionFactory sessionFactory;
	
	public Food findFood(String name) {
		try {
			String sql = "Select e from " + Food.class.getName() + " e where e.food_name =: food_name";
			
			Session session = this.sessionFactory.getCurrentSession();
			Query<Food> query = session.createQuery(sql, Food.class);
			query.setParameter("food_name", name);
			return (Food) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}
	
	public List<Food> findbyCompany_code(String company_code) {
		try {
			String sql = "Select e from " + Food.class.getName() + " e where e.company_code =: company_code";
			
			Session session = this.sessionFactory.getCurrentSession();
			Query<Food> query = session.createQuery(sql, Food.class);
			query.setParameter("company_code", company_code);
			
			List<Food> results = query.list();
			return results;
		} catch (NoResultException e) {
			return null;
		}
	}
	
	public List<Food> findAll() {
		try {
			String sql = "Select e from " + Food.class.getName() + " e ";
			
			Session session = this.sessionFactory.getCurrentSession();
			Query<Food> query = session.createQuery(sql, Food.class);
			
			List<Food> results = query.list();
	        return results;
		} catch (NoResultException e) {
			return null;
		}
	}
}


