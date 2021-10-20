package dp.tdtu;

public class BanBe extends Contact {

	private String loaibanbe;
	public BanBe(String firstName, String lastName, String address, String email, String phone) {
		super(firstName, lastName, address, email, phone);
		// TODO Auto-generated constructor stub
	}

	public void write() {
		// TODO Auto-generated method stub
		
	}



	public String getLoaibanbe() {
		return loaibanbe;
	}

	public void setLoaibanbe(String loaibanbe) {
		this.loaibanbe = loaibanbe;
	}

	@Override
	public String toString() {
		return "BanBe [loaibanbe=" + loaibanbe + ", getLoaibanbe()=" + getLoaibanbe() + ", getfirstName()="
				+ getfirstName() + ", getlastName()=" + getlastName() + ", getAddress()=" + getAddress()
				+ ", getEmail()=" + getEmail() + ", getPhone()=" + getPhone() + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
}
