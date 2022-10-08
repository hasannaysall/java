package polymorphismDemo;

public class CustomerManager extends BaseLogger {
	private BaseLogger logger;

public CustomerManager(BaseLogger logger){
	this.logger=logger;
}
	public void add() {

	

		this.logger.log("Log mesaji");
	}

}