package oops_inheritance;

public class UseBank {
	
	public static void main(String [] args) {
		Bank b=new Bank();
		System.out.println(b.loan(50000));
		System.out.println(b.loan(50000,100000));
		System.out.println(b.loan(1500000,50000,100000));
		
		
	}

}
