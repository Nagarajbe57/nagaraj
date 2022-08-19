package oops_inheritance;

public class Bank {
		public int loan(int initial) {
			return initial;
		}
		public int loan(int salary,int initial) {
			return (salary*10)+initial;
		}
		public int loan(int asset,int salary,int initial) {
			return (asset/2)+(salary*10)+initial;
		}
		
	}
