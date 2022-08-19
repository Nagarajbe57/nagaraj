package oops;

public class Salary {
	private int basic;
	private int pf;
	private int bonus;

	public void setSalary(int basic) {
		this.basic=basic;
	}
	public int getSalary() {
		return this.basic;
	}
	public void setPf(int pf) {
		this.pf=pf;
	}
	public int getPf() {
		return this.pf;
	}
	public void setBonus(int bonus) {
		this.bonus=bonus;
	}
	public int getBonus() {
		return this.bonus;
	}
	public Salary(int basic ,int pf,int bonus) {
		this.basic=basic;
		this.pf=pf;
		this.bonus=bonus;
	}
	public String toString() {
		return "BASIC="+basic+" "+"PF="+pf+" "+"BONUS="+bonus;
	}
	}

