package datatypes;

public class nanthanMukesh {
	public static void main(String [] args) {
	String word=args[0];
	int num=Integer.parseInt(args[0]);
	int res=0;
	int result=1;
	for (int i=1;i<=num;i++)
	{
		res=res+i;
		result=result*res;
	}
System.out.println(result);
}
}