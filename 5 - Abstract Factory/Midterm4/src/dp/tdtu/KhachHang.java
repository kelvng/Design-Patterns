package dp.tdtu;

public class KhachHang extends Contact{

	private String infoCty;
	public KhachHang(String firstName, String lastName, String address, String email, String phone) {
		super(firstName, lastName, address, email, phone);
		// TODO Auto-generated constructor stub
	}

	public void write() {
		// TODO Auto-generated method stub
		
	}

	public String getInfoCty() {
		return infoCty;
	}

	public void setInfoCty(String infoCty) {
		this.infoCty = infoCty;
	}

	@Override
	public String toString() {
		return "KhachHang [infoCty=" + infoCty + ", getInfoCty()=" + getInfoCty() + ", getfirstName()=" + getfirstName()
				+ ", getlastName()=" + getlastName() + ", getAddress()=" + getAddress() + ", getEmail()=" + getEmail()
				+ ", getPhone()=" + getPhone() + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	
}
