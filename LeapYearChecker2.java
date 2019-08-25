
public class LeapYearChecker2 {

	public static void main(String[] args) {
		
		int year = 1901;
		
		if (year % 4 == 0)
		{
			if ( year % 100== 0)
			{
				if (year % 400==0)
					System.out.println("Leap year");
				else 
					System.out.println("Not a leap year");
			}
			else
				System.out.println("Leap year");
		}
		else 
			System.out.println("Not a leap year");
		
			
			

	

}
}