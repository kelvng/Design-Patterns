package dp.tdtu.demo;

public class RenameMethod {

	private static String getsnm() {
		// The name of a method doesn’t explain what the method does.
		String secondname = "Khang";
		System.out.println(secondname);
		return secondname;
	}
	
	private static String getSecondName() {
		// Rename the method.
		// Try to give the new method a name that reflects what it does.
		String secondname = "Khang";
		System.out.println(secondname);
		return secondname;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getsnm();
		getSecondName();
	}


}
