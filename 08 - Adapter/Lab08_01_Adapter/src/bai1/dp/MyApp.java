package bai1.dp;

public class MyApp {

	ISimpleFTP ftp;
	public void setFTP(ISimpleFTP ftp) {
		this.ftp = ftp;
	}
	public void doSomething() {
		ftp.connectServer();
		ftp.sendMsg("abc");
	}
}
