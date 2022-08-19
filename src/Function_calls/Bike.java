package Function_calls;

public class Bike {
	String brand;
	int price;
	String model;
	int taxPer;
	public void  findNetprice() {
		System.out.println("NetPrice="+(price+(price*taxPer/100)));
	}

}
