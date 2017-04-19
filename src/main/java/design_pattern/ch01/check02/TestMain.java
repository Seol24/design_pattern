package design_pattern.ch01.check02;

public class TestMain {
	public static void main(String[] args) {
		Phone phone1 = new Phone();
		phone1.setNumber("010-1212-1212");
		
		Phone phone2 = new Phone();
		phone2.setNumber("010-1111-2222");
		
		Person p = new Person();
		p.setHomephones(phone2);
		p.setOfficephones(phone1);
		
		
		System.out.println(p);
	}
}
