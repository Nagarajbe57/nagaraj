package oops;

public class UseCar {
	public static void main (String[] args) {
		Engine eng=new Engine();
		eng.brand="FORD";
		eng.price=100000;
		eng.noOfPistons=4;
	
		Car car1=new Car();
		car1.brand="Ford";
		car1.color="BLACK";
		car1.price=300000;
		car1.engine=eng;
		
		System.out.println("CAR BRAND="+car1.brand);
		System.out.println("ENGINE PRICE="+car1.engine.price);
		System.out.println("CAR PRICE="+car1.price);
	}

}
