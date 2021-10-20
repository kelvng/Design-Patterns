package dp.tdtu;

public class HoHang extends Contact{
	private String quanhe;
	
	public HoHang(String firstName, String lastName, String address, String email, String phone,String quanhe) {
		super(firstName, lastName, address, email, phone);
		// TODO Auto-generated constructor stub
		this.quanhe=quanhe;
	}
	public String getQuanhe() {
		return quanhe;
	}
	public void setQuanhe(String quanhe) {
		this.quanhe = quanhe;
	}
	void write() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

	}
	public void viewContacts() {
		super.viewContacts();
		System.out.println(this.getQuanhe());
	}
}
