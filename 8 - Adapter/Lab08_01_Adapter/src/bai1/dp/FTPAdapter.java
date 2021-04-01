package bai1.dp;

public class FTPAdapter implements ISimpleFTP {

	private IcomplexFTP complexFTP;
	
	public FTPAdapter() {
		complexFTP = new ComplexFTP();
	}
	
	public void sendMsg(String msg) {
		String[] msgs = new String[] {msg};
		complexFTP.sendMsg(msgs);
	}
	
	public void connectServer() {
		complexFTP.connect();
	}
}
