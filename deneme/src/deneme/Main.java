package deneme;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int sayi, i;
		int faktoriyel, kontrol;
		Scanner sc = new Scanner(System.in);
		System.out.print("Sayiyi giriniz : ");
		sayi = sc.nextInt();
		int toplam = 0;
		int sonKontrol = sayi;
		while (sayi != 0)// sayi 0' eşit olmadığı surece dongu devam edecek
		{
			i = 1;
			faktoriyel = 1;
			kontrol = sayi % 10;// sayinin 10 ile bolumunden kalani alıp birler basamagini bulmus oluyoruz
			while (i <= kontrol)// birler basamaginin faktoriyelini hesapliyoruz
			{
				faktoriyel *= i;
				i++;
			}
			toplam = toplam + faktoriyel;// faktoriyeli toplama ekliyoruz
			sayi = sayi / 10;// sayiyi 10'a bolup diger basamklari bulmak için dongu tekrar
		}
		if (toplam == sonKontrol)
			System.out.println(sonKontrol + " guclu sayi");
		else
			System.out.println(sonKontrol + "guclu sayi degil");

	}

}
