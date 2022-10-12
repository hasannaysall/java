package dataAccess;

import categories.Program;

public class JdbcProductDao implements ProductDao {

	@Override
	public void add(Program program) {
		System.out.println("Jdbc veritabanina eklendi");

	}

}
