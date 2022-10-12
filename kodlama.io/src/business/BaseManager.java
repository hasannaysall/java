package business;

import categories.Program;
import dataAccess.ProductDao;

public class BaseManager {
	private ProductDao productDao;
	

	public BaseManager( ProductDao productDao) {
		
		this.productDao = productDao;
	}

	public void add(Program program) throws Exception {
		if (program.getKursFiyati() < 0) {

			throw new Exception("Kurs fiyati sıfırdan kucuk olamaz");
		}
		
		System.out.println(program.getKursAdi());
		System.out.println(program.getKursFiyati());
		productDao.add(program);
		
	
	}

}
