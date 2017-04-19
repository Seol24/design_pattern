package design_pattern.ch01.check05;

import java.util.ArrayList;
import java.util.HashSet;

public class Course {
	private String courName;
	private ArrayList<Student> studName = new ArrayList<>();
	
	
	
	public Course() {}

	public ArrayList<Student> getStudName() {
		return studName;
	}

	public void setStudName(ArrayList<Student> studName) {
		this.studName = studName;
	}
	
	public String getCourName() {
		return courName;
	}

	public void setCourName(String courName) {
		this.courName = courName;
	}
	
	public void dropStudent(Student student) {
		studName.remove(student);
	}

	public void registerStudent(Student student) {
		studName.add(student);
	}

	public Course(String courName) {
		this.courName = courName;
	}
	public Course(ArrayList<Student> student) {
		this.studName = student;
	}

	public Course(HashSet<Student> student) {
		this.studName = studName;
	}

	@Override
	public String toString() {
		return String.format("Course %s %s",  studName,courName);
	}

}
