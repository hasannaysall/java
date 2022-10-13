package hashMapDemo;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap<String, String> sozluk=new HashMap<String,String>();
		sozluk.put("book", "kitap");//book=kitap olarak ekliyor.Book keydir
		sozluk.put("computer", "bilgisayar");
		sozluk.put("table", "masa");
		
		System.out.println(sozluk.get("computer"));
		
		for(String item:sozluk.keySet()) {//keyleri gosteriri
			System.out.println(item);
		}
			for(String item:sozluk.keySet()) {
				System.out.println("Eleman-"+item+" Deger-"+sozluk.get(item));
		}
	}

}
