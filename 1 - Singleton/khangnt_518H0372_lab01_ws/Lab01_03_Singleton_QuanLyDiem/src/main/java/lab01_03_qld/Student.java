package lab01_03_qld;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student{
	private String name;
	private Date birthDate;
	private Lecturer assistant;
	private List<Grade> grades = new ArrayList<Grade>();
	
	public Student(String name,Date birthDate, Lecturer assistant,List<Grade> grades) {
		super();
		this.name=name;
		this.birthDate=birthDate;
		this.assistant=assistant;
		this.grades=grades;
		
	}
	public String getName() {
		return name;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public Lecturer getAssistant() {
		return assistant;
	}
	public List<Grade> getGrades(){
		return grades;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", birthDate=" + birthDate + ", assistant=" + assistant + ", grades=" + grades
				+ "]";
	}
	
	public double getAvgGrade() {
		double sumGrade = 0;
		double temp=0;
		for(Grade grade : this.grades) {
			sumGrade += grade.getGrade();
		}
		
		temp= sumGrade/this.grades.size();	
		if (temp>=9) {
			System.out.println("Xếp loại xuất sắc");
		}
		else if(temp>=8) {
			System.out.println("Xếp loại giỏi");
		}
		else if( temp>=7) {
			System.out.println("Xếp loại khá");
		}
		else if(temp>=6) {
			System.out.println("Xếp loại trung bình khá");
		}
		else if(temp>=5) {
			System.out.println("Xếp loại trung bình");
		}
		else {
			System.out.println("không được tốt nghiệp");
		}
		return temp;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public void setAssistant(Lecturer assistant) {
		this.assistant = assistant;
	}
	public void setGrades(List<Grade> grades) {
		this.grades = grades;
	}
}

