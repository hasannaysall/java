package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.id=1;
		product.name="Laptop";
		product.description="Monster Laptop";
		product.price=5000;
		product.stockAmount=5;
	
		ProductManager productManager =new ProductManager();
		productManager.Add(product);
	}

}
