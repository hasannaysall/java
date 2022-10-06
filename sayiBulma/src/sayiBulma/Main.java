package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayi = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 5;
		int kontrol = 0;
		for (int i = 0; i < sayi.length; i++) {
			if (sayi[i] == aranacak)
				kontrol = 1;
		}
		if (kontrol == 1)
			System.out.println("Sayi bulundu");
		else
			System.out.println("Sayi bulunamadi");

	}

}
