package one_to_many_uniass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestGetFoodOrderById {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		FoodOrder food=entityManager.find(FoodOrder.class, 5);
		if(food != null)
		{
			System.out.println(food);
		}
		else
		{
			System.out.println("Id not found");
		}
	}

}
