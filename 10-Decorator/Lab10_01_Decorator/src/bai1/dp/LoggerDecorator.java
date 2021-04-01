package bai1.dp;

public abstract class LoggerDecorator extends Logger{

	protected Logger logger;
	
	public LoggerDecorator(Logger logger) {
		this.logger = logger;
	}
	

}
