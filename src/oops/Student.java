package oops;

public class Student {
	private String name;
	private Subject subject;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
			return this.name;			
	}

	public void setSubject(Subject subject) {
		this.subject=subject;
	}
	public Subject getSubject() {
		return this.subject;
	}
	public Student(String name,Subject subject) {
		this.name=name;
		this.subject=subject;
	}
	public String toString() {
		return "NAME="+name+"\n"+"SUBJECT"+subject;
	}
}
