package arraysDemo;

public class Main {
	public static void main(String args[]) {
		String ogrenci1 = "name1";
		String ogrenci2 = "name2";
		String ogrenci3 = "name3";
		String ogrenci4 = "name4";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);

		System.out.println("----------------");

		String[] ogrenciler = new String[4];
		ogrenciler[0] = "name1";
		ogrenciler[1] = "name2";
		ogrenciler[2] = "name3";
		ogrenciler[3] = "name4";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);

		}
		System.out.println("----------------");
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
	}

}
