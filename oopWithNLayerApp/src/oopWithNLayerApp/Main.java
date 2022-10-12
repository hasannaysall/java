package oopWithNLayerApp;

import oopWithNLayerApp.business.ProductManager;
import oopWithNLayerApp.core.logging.DatabaseLogger;
import oopWithNLayerApp.core.logging.FileLogger;
import oopWithNLayerApp.core.logging.ILogger;
import oopWithNLayerApp.dataAccess.HibernateProductDao;
import oopWithNLayerApp.dataAccess.JdbcProductDao;
import oopWithNLayerApp.dataAccess.ProductDao;
import oopWithNLayerApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1=new Product(1,"Iphone 14",20000);
		/*ILogger[] iloggers=new ILogger[] {new FileLogger(),	new DatabaseLogger()};
		for(ILogger ilogger:iloggers) {
			ilogger.log("loglandi");*/
		
		ProductManager productManager =new ProductManager(new HibernateProductDao());
		productManager.add(product1);
	
		

	}

}
