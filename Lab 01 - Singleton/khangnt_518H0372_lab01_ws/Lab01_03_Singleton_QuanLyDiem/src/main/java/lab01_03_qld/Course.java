package lab01_03_qld;

public class Course {
	private String name;
	private int credit;
	private Lecturer lecturer;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public void setLecturer(Lecturer lecturer) {
		this.lecturer = lecturer;
	}

	public Course(String name,int credit,Lecturer lecturer) {
		super();
		this.name=name;
		this.credit=credit;
		this.lecturer=lecturer;
	}
	
	public String getName() {
		return name;
	}
	public int getCredit() {
		return credit;
	}
	public Lecturer getLecturer() {
		return lecturer;
	}
}
