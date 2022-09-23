package oop;

public class Main {
public static void main(String[] args) {
	
	Customer customer1 = new Customer();
	customer1.setId(45632);
	customer1.setCustomerNumber("654782");
	customer1.setNumber("75");
	
	Product product1 = new Product();
	product1.setName("b marka kahve makinesi");
	product1.setUnitPrice(2500);
	product1.setDiscount(6);
	product1.setUnitInStock(14);
	product1.setImageUrl("adres2.jpg");

	Product product2 = new Product();
	product2.setName("c marka kahve makinesi");
	product2.setUnitPrice(750);
	product2.setDiscount(9);
	product2.setUnitInStock(25);
	product2.setImageUrl("adres3.jpg");
	
	Product product3 = new Product();
	product3.setName("d marka kahve makinesi");
	product3.setUnitPrice(1400);
	product3.setDiscount(6);
	product3.setUnitInStock(5);
	product3.setImageUrl("adres4.jpg");
	
	Product[] products = {product1,product2,product3};
	for (Product product : products) {
		System.out.println(product.getName());
	}
	
	
	
	
	
	
			
}
}
