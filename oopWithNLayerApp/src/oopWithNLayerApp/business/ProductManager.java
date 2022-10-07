package oopWithNLayerApp.business;


import oopWithNLayerApp.dataAccess.JdbcProductDao;
import oopWithNLayerApp.dataAccess.ProductDao;
import oopWithNLayerApp.entities.Product;

public class ProductManager  {
private ProductDao productDao;


	public ProductManager(ProductDao productDao) {
	this.productDao = productDao;
}


	public void add(Product product) throws Exception  {
	//is kurallari
	
	if(product.getUnitPrice()<10) {
		throw new Exception("Urun fiyati 10dan kucuk olamaz");
	}
	
	productDao.add(product);
	 
	
}
}
