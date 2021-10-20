package dp.tdtu;

public class HoHang extends Contact {

	private String quanhe;
	public HoHang(String firstName, String lastName, String address, String email, String phone, String quanhe) {
		super(firstName, lastName, address, email, phone);
		// TODO Auto-generated constructor stub
	}
	public String getQuanhe() {
		return quanhe;
	}
	public void setQuanhe(String quanhe) {
		this.quanhe = quanhe;
	}
	public void write() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "HoHang [quanhe=" + quanhe + ", getQuanhe()=" + getQuanhe() + ", getfirstName()=" + getfirstName()
				+ ", getlastName()=" + getlastName() + ", getAddress()=" + getAddress() + ", getEmail()=" + getEmail()
				+ ", getPhone()=" + getPhone() + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
