package oops;

public class Employe {
	private String name;
	private int id;
	private Salary salary;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return this.id;
	}
	public void setSalary(Salary salary) {
		this.salary=salary;
	}
	public Salary getSalary() {
		return this.salary;
	
	}
	public Employe(String name, int id, Salary salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public String toString() {
		return "NAME="+name+" "+"ID="+id+" "+"SALARY="+salary;
		
	}
	}
	

