package oops_inheritance;

public class Medical extends Student {
	String deptType;
	boolean isSurgeon;
	int yearExperiance;
	public String findExperianc(int yearExperiance) {
		if(yearExperiance==0) {
			return "No experiance";
		}
		else {
			return "EXPERIANCED";
			}
	}
	public void Medical(String name,int age,int rNum,String deptType,boolean isSurgeon,int yeatExperiance) {
		this.name=name;
		this.age=age;
		this.rNum=rNum;
		this.deptType=deptType;
		this.isSurgeon=isSurgeon;
		this.yearExperiance=yearExperiance;
	}
	public String toString() {
		return "NAME="+this.name+"\n"+"AGE="+this.age+"\n"+"ROLL NUM="+this.rNum+"\n"+"DEPARTMENT="+deptType+"\n"+"Surgeon="+this.isSurgeon+"\n"+"EXPERIANCE="+this.yearExperiance;
	}
}