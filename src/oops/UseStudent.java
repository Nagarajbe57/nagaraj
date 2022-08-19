package oops;

public class UseStudent {
	public static void main (String [] args) {
		Subject sub=new Subject(80,80,90,95,91);
		Student s1=new Student("NAGARAJ",sub);
		System.out.println(s1);
	}
}
