package design_pattern.ch01.check05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Student {
	private ArrayList<Course> courses = new ArrayList<>();
	private String name;

	public Student() {
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String name) {
		this.name = name;
	}
	public void dropCourse(Course Course) {
		courses.remove(Course);
	}

	public void registerCourse(Course course) {
		courses.add(course);
	}

	public Student(ArrayList<Course> course) {
		this.courses = course;
	}

	public Student(HashSet<Course> course) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return String.format("Student %s %s", name, courses);
	}


}