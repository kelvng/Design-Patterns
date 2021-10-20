package StrategyPattern;

import java.util.Date;

public class Student {
	private int code;
	private String name;
	private Date birthdate;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	@Override
	public String toString() {
		return "Student [code=" + code + ", name=" + name + ", birthdate=" + birthdate + "]";
	}
	
}
