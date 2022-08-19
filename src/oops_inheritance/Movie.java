package oops_inheritance;

public class Movie {
	public String action(int fights) {

	if(fights==0) {
	return	"MOKKA MOVIE";
	}
	else if(fights>=1&&fights<3) {
		return "OKAY MOVIE";
	}
	else if(fights>=3&&fights<=5) {
		return "Super Movie";
	}
	else if(fights>5) {
		return "Good";
	}
	else {
		return "NOTHING TO SAY";
	}
	}
}


