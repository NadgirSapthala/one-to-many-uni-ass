package one_to_many_uniass;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveFoodOrder {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Item item1 = new Item();
		item1.setName("MasalaDosa");
		item1.setQuantity(1);
		item1.setCost(45);

		Item item2 = new Item();
		item2.setName("Idli");
		item2.setQuantity(2);
		item2.setCost(30);

		List<Item> ls = new ArrayList();
		ls.add(item1);
		ls.add(item2);

		FoodOrder food = new FoodOrder();
		food.setAddress("Yelahanka");
		food.setPhone(8217779514l);
		food.setCustomername("sapthala");

		food.setItem(ls);

		entityTransaction.begin();
		entityManager.persist(food);
		entityManager.persist(item1);
		entityManager.persist(item2);
		entityTransaction.commit();

		System.out.println("data saved");

	}

}
