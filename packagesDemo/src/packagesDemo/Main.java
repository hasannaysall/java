package packagesDemo;

import matematik.DortIslem;
import matematik.Faktoriyel;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem=new DortIslem();
		Faktoriyel faktoriyel = new Faktoriyel();
		
		System.out.println(dortIslem.hesapla(12, 3));
		System.out.println(faktoriyel.hesapla(5));

	}

}
