package Function_calls;

public class Student {
	String name;
	int rollNum;
	public void FindTotal (int physics,int maths,int chemistry,int computer) {
		System.out.println("NAME="+name);
		System.out.println("ROLL NUM="+rollNum);
		System.out.println("PHYSICS+"+physics+"CHEMISTRY="+chemistry+"MATHS="+maths+"COMPUTER="+computer);
	
	}
	
	public void  totalMark(int physics,int maths,int chemistry,int computer) {
		System.out.println("total="+(physics+maths+chemistry+computer));
	}
	}
