import business.BaseManager;
import categories.Program;
import dataAccess.HibernateProductDao;
import dataAccess.JdbcProductDao;
import dataAccess.ProductDao;
import instructor.Instructor;


public class Main {

	public static void main(String[] args) throws Exception {
		Program program1=new Program("Java", 15);
		Program program2=new Program("JavaReact", 15);
		Program program3=new Program("JavaScript", 15);
		Program program4=new Program("C# ve Angular", -15);
		Program program5=new Program(".Net", 15);
		Program program6=new Program("Programlama Giris", 15);
		Instructor Instructor1=new Instructor("Engin","Demirog");
		BaseManager baseManager=new BaseManager(new HibernateProductDao());
		baseManager.add(program6);
		Instructor1.add(Instructor1);
	}

}
