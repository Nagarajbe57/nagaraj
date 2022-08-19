package oops_inheritance;

public class UseMS1 {
	public static void main (String [] args) {
		Medical m1=new Medical();
		m1.name="NAGARAJ";	
		m1.age=24;
		m1.rNum=057;
		m1.deptType="DENTIST";
		m1.yearExperiance=5;
		m1.findExperianc(2);
		m1.isSurgeon=true;
		System.out.println(m1);
		System.out.println(m1.findExperianc(m1.yearExperiance));
		
	
		
	}

}
