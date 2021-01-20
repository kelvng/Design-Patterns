package Lab02_01.dp.tdtu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class DataBase {
//	public List<Student> student= new ArrayList<Student>();
	public Student[] student;
	public  static void init() {
		Student st1= new Student("it","Tung",null);
		
	}
	public static Student[] addElement(Student[] student, Student student1) {
		student =Arrays.copyOf(student,student.length+1);
		student[student.length -1] = student1;
		
		return student;
	}
}
