package switchDemo;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Notunuzu giriniz(0-100):");
		char grade;
		int not = scanner.nextInt();
		
		if (not <= 100 & not >= 80)
			grade = 'A';
		else if (not <= 80 & not >= 70)
			grade = 'B';
		else if (not <= 70 & not >= 60)
			grade = 'C';
		else if (not <= 60 & not >= 50)
			grade = 'D';
		else
			grade = 'F';
		
		
		switch (grade) {
		case 'A':
			System.out.println("Mukemmel: Gectiniz");
			break;
		case 'B':
			System.out.println("Harika: Gectiniz");
			break;
		case 'C':
			System.out.println("Iyi: Gectiniz");
			break;
		case 'D':
			System.out.println("Fena Degil: Gectiniz");
			break;
		case 'F':
			System.out.println("Malesef: Kaldiniz");
			break;
		}
	}

}
