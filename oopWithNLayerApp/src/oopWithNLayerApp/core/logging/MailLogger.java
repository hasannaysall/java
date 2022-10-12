package oopWithNLayerApp.core.logging;

import java.lang.System.Logger;

public class MailLogger implements ILogger{

	@Override
	public void log(String data) {
		System.out.println("Mail gonderildi");
		
	}
	
}
