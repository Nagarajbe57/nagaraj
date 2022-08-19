package oops;

public class UseEmploye {
	public static void main (String [] args) {
		Salary s1=new Salary(20000,1500,5000);
		Employe e1=new Employe("n",78,s1);

		System.out.println(e1);
		System.out.println(s1);
	}
}
