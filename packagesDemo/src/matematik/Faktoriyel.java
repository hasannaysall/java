package matematik;

public class Faktoriyel {
public int hesapla(int sayi1) {
	int sonuc=1;
	for(int i=1;i<=sayi1;i++) {
		sonuc*=i;
	}
	return sonuc;
}
}
