package oopWithNLayerApp.dataAccess;

import oopWithNLayerApp.entities.Product;

public class JdbcProductDao implements ProductDao{
	public void add(Product product) {
		System.out.println("JDBC ile veritabanina eklendi");
	}

}
