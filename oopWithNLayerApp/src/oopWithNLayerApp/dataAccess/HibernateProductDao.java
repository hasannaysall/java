package oopWithNLayerApp.dataAccess;

import oopWithNLayerApp.entities.Product;

public class HibernateProductDao implements ProductDao  {
	public void add(Product product) {
		System.out.println("Hibernate ile veritabanına eklendi");
	}
}
 