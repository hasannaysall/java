package abstractClasses;

public class Main {

	public static void main(String[] args) {
		BaseCalculator[] baseCalculators = new BaseCalculator[] { new ManGameCalculator(), new WomanGameCalculator(),
				new KidsGameCalculator() };
		for (BaseCalculator baseCalculator : baseCalculators) {
			baseCalculator.hesapla();
		}

	}

}
