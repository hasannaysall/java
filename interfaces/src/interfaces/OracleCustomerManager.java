package interfaces;

public class OracleCustomerManager implements ICustomerDal, IRepository {

	@Override
	public void add() {
		System.out.println("Oracle eklendi");

	}

}
