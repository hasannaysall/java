package arrayListTypedDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<String>sehirler=new ArrayList<String>();//sadec stringler ile calisir
		sehirler.add("Ankara");
		sehirler.add("Istanbul");
		sehirler.add("Izmir");
		sehirler.add("Aydin");
		
		sehirler.remove("Istanbul");
		Collections.sort(sehirler);//sehirleri alfabetik olarak sıralar
		
		for(String sehir:sehirler) {
			System.out.println(sehir);
		}
	}

}
