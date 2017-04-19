package design_pattern.ch01.check04;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student {
	private String name;
	private ArrayList<Course> courses;
	
	public Student(String name) {
		this();
		this.name = name;
	}
	
	public Student() {
		courses = new ArrayList<>();
	}	
	
	public void registerCourse(Course course){
		
	}
	
	public void dropCourse(Course course){
		
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return String.format("Student [name=%s, courses=%s]", name, courses);
	}
}
