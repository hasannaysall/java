package arrayListWithClass;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer(1, "isim1", "soyad1"));
		customers.add(new Customer(2, "isim2", "soyad2"));
		customers.add(new Customer(3, "isim3", "soyad3"));

		customers.remove(new Customer(1, "isim1", "soyad1"));//silmez refarns tipdir diziler.Newleyince yeni customer olusturdu
		for (Customer customer : customers) {
			System.out.println(customer.firstName);
		}
	}

}
