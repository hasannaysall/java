package miniProjeAsalSayi;

import java.util.Scanner;

public class Main {
	public static void main(String Args[]) {
		Scanner scanner = new Scanner(System.in);
		int asalKontrol = 1;
		System.out.println("Sayi giriniz");
		int sayi = scanner.nextInt();
		for (int i = 2; i <= Math.sqrt(sayi); i++) {
			if (sayi % i == 0) {
				asalKontrol = 0;
			}
		}
		if (sayi == 1)
			System.out.println("Sayi asal degil");
		else if (asalKontrol == 1)
			System.out.println("Sayi asal ");

		else
			System.out.println("Sayi asal degil");

	}

}
