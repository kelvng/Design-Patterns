package lab01_01.dp.tdtu;

public class Student implements Comparable<Student>{
	private int code;
	private String name;
	private double grade;
	
	public Student(int code, String name, double grade) {
		super();
		this.code = code;
		this.name = name;
		this.grade = grade;
	}
	
	public Student(int code, String name) {
		super();
		this.code = code;
		this.name = name;
	}


	public int getCode() {
		//...
		return code;
	}

	public void setCode(int code) {
		//...
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	
	
	@Override
	public String toString() {
		return "Student [code=" + code + ", name=" + name + ", grade=" + grade + "]";
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + code;
		long temp;
		temp = Double.doubleToLongBits(grade);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (code != other.code)
			return false;
		if (Double.doubleToLongBits(grade) != Double.doubleToLongBits(other.grade))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public int compareTo(Student o) {
		if(this.code > o.code) {
			return -1;
		}
		else if(this.code < o.code) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
}
