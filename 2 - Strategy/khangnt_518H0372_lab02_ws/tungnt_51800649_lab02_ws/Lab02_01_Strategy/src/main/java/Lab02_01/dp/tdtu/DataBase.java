package Lab02_01.dp.tdtu;

public class DataBase {
//public Student[] student = new Student[100] ;
public StudentList st1;
public static StudentList init() {
		//Tạo mảng trống
	 	Student[] student = new Student[100] ;
	 	
	 	//Tạo Sinh viên
		Student student1 = new Student(1,"Tung",null);
		Student student2 = new Student(2,"Khang",null);
		Student student3 = new Student(3,"Trường",null);
		Student student4 = new Student(4,"Giang",null);
		Student student5 = new Student(5,"Tín",null);
		Student student6 = new Student(6,"Bảo",null);
		Student student7 = new Student(7,"Kha",null);
		Student student8 = new Student(8,"Chuối",null);
		Student student9 = new Student(9,"Táo",null);
		Student student10 = new Student(10,"Đào",null);
		
		StudentList st1 = new StudentList(student,student.length,null);

		//In ra  Từng Sinh viên;
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());
		System.out.println(student4.toString());
		System.out.println(student5.toString());
		System.out.println(student6.toString());
		System.out.println(student7.toString());
		System.out.println(student8.toString());
		System.out.println(student9.toString());
		System.out.println(student10.toString());

		//Thêm sinh viên vào danh sách:
		st1.addStudent(student6);
		st1.addStudent(student7);
		st1.addStudent(student8);
		st1.addStudent(student9);
		st1.addStudent(student10);
		st1.addStudent(student1);
		st1.addStudent(student2);
		st1.addStudent(student3);
		st1.addStudent(student4);
		st1.addStudent(student5);
		
		
		//In ra danh sách Sinh viên
		System.out.println(st1.toString());
		return st1;

		
		
		
	}
}
