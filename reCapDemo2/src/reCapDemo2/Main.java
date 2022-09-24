package reCapDemo2;

public class Main {
	public static void main(String args[]) {
		double[] myList= {1.5,7.8,14.6,3,7};
		double total=0;
		double max=myList[0];
		for(int i=0;i<myList.length;i++) {
			if(max<myList[i]) {
				max=myList[i];
			}
			total+=myList[i];
		}
		System.out.println("Toplam: "+total);
		System.out.println("En Buyuk Sayi: "+max);
	}

}
