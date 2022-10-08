package Logger;

public class App {

	public static void main(String[] args) {
		Logger logger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();
		logger.Log("Preston");
		logger.Error("Stewart");
		spacedLogger.Log("Sierra");
		spacedLogger.Error("Parker");
	}

}
