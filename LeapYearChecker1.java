
public class LeapYearChecker1 {

	public static void main(String[] args) {
	
		int year = 1908;
		
		if (( year % 4 == 0) && ( year % 100 != 0) || ( year % 400 == 0)) 
			System.out.println("Leap year");
		
		else 
			System.out.println("Not a leap year");

	}

}
