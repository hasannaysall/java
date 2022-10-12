package oopWithNLayerApp.business;


import oopWithNLayerApp.core.logging.ILogger;
import oopWithNLayerApp.dataAccess.JdbcProductDao;
import oopWithNLayerApp.dataAccess.ProductDao;
import oopWithNLayerApp.entities.Product;

public class ProductManager  {
private ProductDao productDao;
private ILogger[] ilogger;


	public ProductManager(ProductDao productDao) {
	this.productDao = productDao;
	this.ilogger=ilogger;
	
}


	public void add(Product product) throws Exception  {
	//is kurallari
	
	if(product.getUnitPrice()<10) {
		throw new Exception("Urun fiyati 10dan kucuk olamaz");
	}
	
	productDao.add(product);
	 
	
}
}
