package dp.tdtu;

public class BanBe2 extends Contact{
	private String loaiBb;
	public BanBe2(String firstName, String lastName, String address, String email, String phone,String loaiBb) {
		super(firstName, lastName, address, email, phone);
		this.loaiBb=loaiBb;
	}
	public String getLoaiBb() {
		return loaiBb;
	}
	public void setLoaiBb(String loaiBb) {
		this.loaiBb = loaiBb;
	}
	void write() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

	}
	public void viewContacts() {
		super.viewContacts();
		System.out.println(this.getLoaiBb());
	}
	public String toString() {
        return "BanBe [Quan he:=" + loaiBb + ", firstName:" + getfirstName() + ", lastName:" + getlastName()
                + ", Address:" + getAddress() + ", Email:" + getEmail() + ", Phone:" + getPhone() + "]";
    }
}
