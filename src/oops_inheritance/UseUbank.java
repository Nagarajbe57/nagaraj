package oops_inheritance;

public class UseUbank {
	public static void main(String [] args) {
		Ubank u=new Ubank();
		AxisBank ab=new AxisBank();
		System.out.println(u.intrest(10000));
		System.out.println(ab.intrest(10000));
		
	}

}
