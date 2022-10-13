package arraylistDemo;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList sayilar=new ArrayList();
		
		sayilar.add(1);
		sayilar.add(10);
		sayilar.add("deneme");
		System.out.println(sayilar.size());//dizide kac eleman olduunu gosterir
		System.out.println(sayilar.get(0));//dizinin 0. elemaninin ne oldugunu gosteriri
		sayilar.set(0, 15);//0. eleman 15 olacak
		sayilar.remove(0);//0. elemani siler
		sayilar.clear();//tum diziyi siler
	    for(Object i:sayilar) {//dizideki elemanlari gosteriri
	    	System.out.println(i);
	    }
	}

}
