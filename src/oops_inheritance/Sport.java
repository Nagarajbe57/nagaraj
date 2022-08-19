package oops_inheritance;

public class Sport {
	String gamename;
	int noOfPlayers;
	boolean isOutdoor;
	
 public Sport (String gamename,int noOfPlayers,boolean isOutdoor) {
	 
 this.gamename=gamename;
 this.noOfPlayers=noOfPlayers;
 this.isOutdoor=isOutdoor;
 }
 public String toString() {
	 return "Sports name="+this.gamename+"\n"+"PLAYERSS COUNT="+this.noOfPlayers+"\n"+"OUtDOOR/INDOOR="+this.isOutdoor;
		
	}


}
