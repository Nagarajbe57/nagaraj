package Function_calls;

public class UseBike {
	public static void main (String [] args) {
		Bike b1=new Bike();
		b1.brand="Bajaj";
		b1.price=70000;
		b1.model="NS200";
		b1.taxPer=10;
		
		Bike b2=new Bike();
		b2.brand="HONDA";
		b2.price=97000;
		b2.model="DIO";
		b2.taxPer=5;
		
		Bike b3=new Bike();
		b3.brand="KTM";
		b3.price=200000;
		b3.model="DUKE200";
		b3.taxPer=7;
		
		System.out.println("Brand="+b1.brand+","+"Price="+b1.price+","+"model="+b1.model);
		b1.findNetprice();	
		System.out.println("Brand="+b2.brand+","+"Price="+b2.price+","+"model="+b2.model);
		b2.findNetprice();		
		System.out.println("Brand="+b3.brand+","+"Price="+b3.price+","+"model="+b3.model);
		b3.findNetprice();		
	}

}
