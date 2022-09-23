package loopDemo;

public class Main {
	public static void main(String args[]) {
		
		// for
		
		for (int i = 0; i < 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("Dongu bitti");

		// while
		
		int j = 0;
		while (j < 10) {
			j += 2;
			System.out.println(j);
		}
		System.out.println("Dongu bitti");
		
		// do while
		
		int n = 0;
		do {
			n += 2;
			System.out.println(n);
		} while (n < 10);
		System.out.println("Dongu bitti");

	}
}