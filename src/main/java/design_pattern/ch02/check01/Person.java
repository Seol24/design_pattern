package design_pattern.ch02.check01;

public class Person {
	private Role r;

	public Person(Role r) {
		this.r = r;
	}

	public Person() {}

	public Role getR() {
		return r;
	}

	public void setR(Role r) {
		this.r = r;
	}
	
	public void doIt(){
		r.doIt();
	}
	
}
