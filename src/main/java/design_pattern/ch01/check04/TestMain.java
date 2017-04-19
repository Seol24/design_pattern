package design_pattern.ch01.check04;

public class TestMain {
	public static void main(String[] args) {
		Course c1 = new Course("Java");
		Course c2 = new Course("android");
		Course c3 = new Course("Database");
		Course c4 = new Course("Html");
		
		
		Student sdh = new Student();
		sdh.registerCourse(c1);
		sdh.registerCourse(c2);
		sdh.registerCourse(c3);
		sdh.dropCourse(c3);
		sdh.registerCourse(c4);
		System.out.println(sdh);
		
		
	}
}
