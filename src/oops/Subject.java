package oops;

public class Subject {
	private int tamil;
	private int english;
	private int maths;
	private int science;
	private int social;
	
	public void setTamil(int tamil) {
		this.tamil=tamil;
	}
	public int getTamil() {
		return this.tamil;
	}
	public void setEnglish(int english) {
		this.english=english;
	}
	public int getEnglish() {
		return this.english;
	}
	public void setMaths(int maths) {
		this.maths=maths;
	}
	public int getMaths() {
		return this.maths;
	}
	public void setScience(int science) {
		this.science=science;
	}
	public int getScience() {
		return this.science;
	}
	public void setSocial(int social) {
		this.social=social;
	}
	public int getSocial() {
		return this.social;
	}
	public Subject(int tamil,int english,int maths,int science,int social) {
		this.tamil=tamil;
		this.english=english;
		this.maths=maths;
		this.science=science;
		this.social=social;
	}
	public String toString() {
		return "\n"+"TAMIL MARK="+tamil+"\n"+"ENGLISH MARK="+english+"\n"+"MATHS MARK="+maths+"\n"+"SCIENCE MARK="+science+"\n"+"SOCIAL MARK="+social;
		
	}

}
