package oopWithNLayerApp;

import oopWithNLayerApp.business.ProductManager;
import oopWithNLayerApp.dataAccess.JdbcProductDao;
import oopWithNLayerApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1=new Product(1,"Iphone 14",20000);
		
		ProductManager productManager =new ProductManager(new JdbcProductDao());
		productManager.add(product1); 

	}

}
