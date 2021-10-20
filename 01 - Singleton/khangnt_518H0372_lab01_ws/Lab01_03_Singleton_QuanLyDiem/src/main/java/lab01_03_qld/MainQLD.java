package lab01_03_qld;
import java.util.Date;
import java.util.List;

public class MainQLD{	
	public static void main(String[] args) {
		Database db = new Database();
		db.initData();
		
		//Work1 
		Student student = db.getStudent("Tung");
		student.getAvgGrade();
	}
}