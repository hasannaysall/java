package methods2;

public class Main {
	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;

	}
	public static int topla2(int... sayilar) {
		int toplam=0;
		for(int i=0;i<sayilar.length;i++) {
			toplam+=sayilar[i];
		}
		return toplam;
	}

	public static void main(String[] args) {
		System.out.println(topla(12, 3));
		System.out.println(topla2(12,78,14,35));
	}

}
