package oops_inheritance;

public class Cricket extends Sport {
	String format;
	String time;
	public Cricket(String gamename,int noOfPlayers,boolean isOutdoor,String format,String time) {
		
		super(gamename,noOfPlayers,isOutdoor);
		this.format=format;
		this.time=time;
	}
	public String toString() {
		return "CRICKET FORMAT="+this.format+"\n"+"PLAYING TIME="+this.time;
	}
	}


