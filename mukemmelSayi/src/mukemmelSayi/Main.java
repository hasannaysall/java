package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		int sayi = 6;
		int toplam = 0;
		for (int i = 1; i < sayi; i++) {
			if (sayi % i == 0)
				toplam += i;
		}
		if (sayi == toplam)
			System.out.println("Sayi mukemmel");
		else
			System.out.println("Sayi mukemmel degil");
	}

}
