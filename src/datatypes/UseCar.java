package datatypes;

public class UseCar {
	static public void main (String [] args) {
		String word=args[0];
		String [] words1=args[0].split(",");
		String [] words2=args[1].split(",");
		String [] words3=args[2].split(",");
		int totalprice=0;
		int totaldistance=0;
		Car car1=new Car();
		car1.brand=words1[0];
		car1.distance=Integer.parseInt(words1[1]);
		car1.price=Integer.parseInt(words1[2]);
		Car car2=new Car();
		car2.brand=words2[0];
		car2.distance=Integer.parseInt(words2[1]);
		car2.price=Integer.parseInt(words2[2]);
		Car car3=new Car();
		car3.brand=words3[0];
		car3.distance=Integer.parseInt(words3[1]);
		car3.price=Integer.parseInt(words3[2]);
		Car[] cars=new Car[3];
		cars[0]=car1;
		cars[1]=car2;
		cars[2]=car3;
		for (int i=0;i<=2;i++) {
			totalprice=totalprice+cars[i].price;
			totaldistance=totaldistance+cars[i].distance;
		}
			System.out.print("Total Price="+totalprice+","+"Total Distance="+totaldistance);
		}
		
	}
