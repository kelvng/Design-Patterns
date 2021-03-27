package dp.tdtu;

public class KhachHang extends Contact{
	private String thongtin;
	public KhachHang(String firstName, String lastName, String address, String email, String phone,String thongtin) {
		super(firstName, lastName, address, email, phone);
		// TODO Auto-generated constructor stub
		this.thongtin=thongtin;
	}
	
	public String getThongtin() {
		return thongtin;
	}

	public void setThongtin(String thongtin) {
		this.thongtin = thongtin;
	}

	void write() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
	}
	public void viewContacts() {
		super.viewContacts();
		System.out.println(this.getThongtin());
	}
}
