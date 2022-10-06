package stringsDemo;

public class Main {
	public static void main(String args[]) {
		String mesaj = "Bugun hava cok guzel.";
		System.out.println(mesaj);

		System.out.println("Eleman sayisi: " + mesaj.length());
		System.out.println("5.eleman: " + mesaj.charAt(4));// 5.elemani gosterir
		System.out.println(mesaj.concat("Yasasin!"));// string sonuna yasasin ekleyecek
		System.out.println(mesaj.startsWith("B"));// string B ile basliyorsa true dondurecek
		System.out.println(mesaj.endsWith("."));
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("a"));// a nın bastan kacıncı oldugunu gosteriri
		System.out.println(mesaj.lastIndexOf("a"));

		String yeniMesaj = mesaj.replace(' ', '-');// bosluklara - ekledi
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2, 4));// 2.indexten baslayıp 3.indexse kadar dondurur

		for (String kelime : mesaj.split(" ")) {// bosluklari atarak yazdiracak
			System.out.println(kelime);
		}

		System.out.println(mesaj.toLowerCase());// tum harfleri kucuk yapar
		System.out.println(mesaj.toUpperCase());// tum harfleri buyuk yapar
		System.out.println(mesaj.trim());// metnin basindaki ve sonundaki bosluklari alır
	}

}
