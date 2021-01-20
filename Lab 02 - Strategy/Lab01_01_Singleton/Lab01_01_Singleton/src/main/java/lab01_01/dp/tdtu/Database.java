package lab01_01.dp.tdtu;

public class Database {
	public static LogicalClass init() {
		
		Student student01 = new Student(1, "NTP01",8);
		Student student02 = new Student(2, "NTP02",6);
		Student student03 = new Student(3, "NTP03",4);
		Student student04 = new Student(4, "NTP04",9);
		
		LogicalClass classCLC = new LogicalClass("HK2", 2021);
		classCLC.getStudents().add(student01);
		classCLC.getStudents().add(student02);
		classCLC.getStudents().add(student03);
		classCLC.getStudents().add(student04);
		
		return classCLC;
	}
}
