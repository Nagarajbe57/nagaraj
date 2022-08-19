package oops;

public class UseCamera {
	public static void main (String [] args) {
		
		Lens l=new Lens("20X","GLASS",30000);
		Camera c=new Camera("CANON",100000,l);
		System.out.println(c);
		
	}

}
