package design_pattern.ch01.check03;

public class Professor {
	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Professor(Student student) {
		this.student = student;
	}

	public Professor() {}

	@Override
	public String toString() {
		return "Professor [student=" + student + "]";
	}
	
	
	
}
