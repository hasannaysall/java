package recapDemo1;

public class Main {
	public static void main(String args[]) {
		int sayi1 = 15;
		int sayi2 = 78;
		int sayi3 = -14;
		int enBuyuk = sayi1;

		if (enBuyuk < sayi2) {
			enBuyuk = sayi2;
		}

		else if (enBuyuk < sayi3) {
			enBuyuk = sayi3;
		}
		System.out.println(enBuyuk);
	}

}
