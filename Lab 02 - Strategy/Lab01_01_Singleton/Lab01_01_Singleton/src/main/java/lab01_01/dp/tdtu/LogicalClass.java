package lab01_01.dp.tdtu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LogicalClass {
	private String semester;
	private int year;
	private List<Student> students = new ArrayList<Student>();
	
	public LogicalClass(String semester, int year) {
		super();
		this.semester = semester;
		this.year = year;
	}

	
	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	public List<Student> sortAscByGrade(){
		Collections.sort(this.students, new Comparator<Student>() {

			public int compare(Student o1, Student o2) {
				if(o1.getGrade() > o2.getGrade())
					return 1;//o2 o1
				else if(o1.getGrade() < o2.getGrade())
					return -1;//o1 o2
				else 
					return 0;//o1 o2 or o2 o1
			}
			
		});
		return this.students;
	}

	public List<Student> sortDescByGrade(){
		Collections.sort(this.students, new Comparator<Student>() {

			public int compare(Student o1, Student o2) {
				if(o1.getGrade() > o2.getGrade())
					return -1;
				else if(o1.getGrade() < o2.getGrade())
					return 1;
				else 
					return 0;
			}
			
		});
		return this.students;
	}
	
	public List<Student> sortByCode(){
		Collections.sort(this.students);
		return this.students;
	}
	@Override
	public String toString() {
		return "LogicalClass [semester=" + semester + ", year=" + year + ", students=" + students + "]";
	}
	
	
}
