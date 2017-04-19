package design_pattern.ch01.check03;

public class Student {
	private Professor advisor;

	public Professor getAdvisor() {
		return advisor;
	}

	public void setAdvisor(Professor advisor) {
		this.advisor = advisor;
	}

	public Student(Professor advisor) {
		this.advisor = advisor;
	}

	public Student() {}

	@Override
	public String toString() {
		return "Student [advisor=" + advisor + "]";
	}
	
	
	
	
}
