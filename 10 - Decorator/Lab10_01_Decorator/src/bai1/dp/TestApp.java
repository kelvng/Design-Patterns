package bai1.dp;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Logger log = new DefaultLogger();
		Logger zipLog = new ZipLoggerDecorator(log);
		
		zipLog.log("Test");
	}

}