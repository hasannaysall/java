
package oop;

public class Main {

  
    public static void main(String[] args) {
       Product product1=new Product();
       product1.setName("a kahve makinesi");
       product1.setDiscount(6);
       product1.setUnitprice(400);
       product1.setUnitsInStock(12);
       product1.setImageUrl("adres.jpg");
       
       Product product2=new Product();
       product2.setName("b kahve makinesi");
       product2.setDiscount(2);
       product2.setUnitprice(700);
       product2.setUnitsInStock(42);
       product2.setImageUrl("adres2.jpg");
       
       Product product3=new Product();
       product3.setName("c kahve makinesi");
       product3.setDiscount(17);
       product3.setUnitprice(860);
       product3.setUnitsInStock(14);
       product3.setImageUrl("adres3.jpg");
       
       Product[] products = {product1,product2,product3};
       
        for (Product product : products) {
            System.out.println(product.getName());
            
        }
       
       IndividualCustomer individualCustomer =new IndividualCustomer();
       individualCustomer.setId(1235);
       individualCustomer.setFirstName("ad");
                    
       
       
       
       
    }
    
}
