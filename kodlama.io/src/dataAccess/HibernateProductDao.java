package dataAccess;

import categories.Program;

public class HibernateProductDao implements ProductDao {

	@Override
	public void add(Program program) {
		System.out.println("Hibernate veritabanina eklendi");

	}

}
