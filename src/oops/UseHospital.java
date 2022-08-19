package oops;

public class UseHospital {
	public static void main (String [] args) {
	Patient p1=new Patient();
	p1.name="SURYA";
	p1.age=25;
	p1.bedNo=108;
	p1.disease="FEVER";
	p1.mobileNum=9976056093l;
	
	Hospital h1=new Hospital();
	h1.name="RAJIV GANDHI";
	h1.location="CHENNAI";
	h1.contact=956164161641l;
	h1.patient=p1;
	
	System.out.println("PATIENT NAME="+p1.name+" "+"PATIENT MOBILE NUM="+p1.mobileNum+" " +"PATIENT BED NO="+p1.bedNo+" "+"PATIENT DISEAS="+p1.disease);
	System.out.println("HOSPITAL NAME="+h1.name);
	
	}
	
}
