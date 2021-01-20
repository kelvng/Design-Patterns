package lab01_01.dp.tdtu;

import java.util.List;

public class MainApp {
	public static void main(String[] args) {
		LogicalClass clcClass = Database.init();
		System.out.println(clcClass.toString());
		
		//work 1
		List<Student> students = clcClass.sortAscByGrade();
		System.out.println(students);	
		
		//work 2
		students = clcClass.sortDescByGrade();
		System.out.println(students);
		
		//work 3
		students = clcClass.sortByCode();
		System.out.println(students);
	}
}
