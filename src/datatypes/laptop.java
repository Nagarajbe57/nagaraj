package datatypes;
public class laptop {
	public static void main (String [] args) {
		Laptop1 lap1=new Laptop1();
		lap1.brand="LENOVO";
		lap1.price=35000;
		lap1.color="WHITE";
		lap1.version=2002;
		lap1.isTouchScreen=true;
		
		Laptop1 lap2=new Laptop1();
		lap2.brand="HP";
		lap2.price=34000;
		lap2.color="BLACK";
		lap2.version=2003;
		lap2.isTouchScreen=false;
				
		Laptop1 lap3=new Laptop1();
		lap3.brand="ASUS";
		lap3.price=33000;
		lap3.color="BLUE";
		lap3.version=2004;
		lap3.isTouchScreen=true;
				
		Laptop1 lap4=new Laptop1();
		lap4.brand="SAMSUNG";
		lap4.price=32000;
		lap4.color="GREEN";
		lap4.version=2005;
		lap4.isTouchScreen=false;
				
		Laptop1 lap5=new Laptop1();
		lap5.brand="NOKIA";
		lap5.price=31000;
		lap5.color="RED";
		lap5.version=2006;
		lap5.isTouchScreen=true;
		
		Laptop1 [] laps= {lap1,lap2,lap3,lap4,lap5};
		for (Laptop1 L:laps) {
			if (L.isTouchScreen==true) {
				System.out.println(L.brand+" "+L.price);
			}
		}
				
		
	}

}
class Laptop1 {
	String brand;
	int price;
	String color;
	int version;
	boolean isTouchScreen;
}

