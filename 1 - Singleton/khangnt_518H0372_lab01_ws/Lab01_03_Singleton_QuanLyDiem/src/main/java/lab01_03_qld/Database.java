package lab01_03_qld;

import java.util.ArrayList;
import java.util.List;

public class Database {
	private List<Lecturer> lectures = new ArrayList<Lecturer>();
	private List<Student> students = new ArrayList<Student>();
	private List<Course> courses = new ArrayList<Course>();
	
	public void initData() {		
		Lecturer ll = new Lecturer("Mai van manh",null,"Thac si");
		lectures.add(ll);
		
		Course lc = new Course("NLP",10, ll);
		courses.add(lc);
		
		Course lc2 = new Course("MTK",10, ll);
		courses.add(lc2);
		
		Student st1 = new Student("Tung",null,null,null);
		st1.getGrades().add(new Grade(lc, 8));		
		st1.getGrades().add(new Grade(lc2, 5));
		
		students.add(st1);
	}

	public List<Lecturer> getLectures() {
		return lectures;
	}

	public void setLectures(List<Lecturer> lectures) {
		this.lectures = lectures;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}		
	
	public Student getStudent(String name) {
		for(Student student : this.students) {
			if(student.getName().equals(name)) {
				return student;
			}
		}
		return null;
	}
}
