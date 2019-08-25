
public class LeapYearChecker3 {

	public static void main(String[] args) {
		
		int year = 1900;
		
		if (year % 400 ==0)
		{
			System.out.println("Leap year");
		
		}
		else if ( year % 100 == 0)
		{
			System.out.println("Not a leap year");
		
	    }
		else if ( year % 4 == 0)
		{
			System.out.println("Leap year");
			
			
		}
		else 
		{
			System.out.println("Not a leap year");
		}
}
}
