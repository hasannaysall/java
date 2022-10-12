package oopWithNLayerApp.core.logging;

public class DatabaseLogger implements ILogger {

	@Override
	public void log(String data) {
		System.out.println("Database dosyaya loglandi:" + data);

	}

}
