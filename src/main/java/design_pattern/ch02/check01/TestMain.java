package design_pattern.ch02.check01;

public class TestMain {
	public static void main(String[] args) {
		Person p = new Person();
		p.setR(new Driver());
		p.doIt();
		p.setR(new Worker());
		p.doIt();
	}
}
