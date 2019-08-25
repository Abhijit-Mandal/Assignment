
public class TaxCalculator {

	public static void main(String[] args) {
		
		float income;
		income = 34000.00f;
		
		if ((income >= 0.00) && (income <= 14999.99))
				{
			System.out.println("$"+((15*income)/100 + income));
				}
		else if (( income >= 15000.00) && ( income <= 29999.99))
		{
			System.out.println ("$"+((18*(income-15000.00))/100 + 2250 + income));
		}
		else if (( income >= 30000.00 ) && (income <= 49999.99))
		{
			System.out.println ("$"+((22*(income-30000.00))/100 + 5400 + income));
		}
		else if ((income >= 50000.00) && (income <= 79999.99))
		{
			System.out.println ("$"+((27*(income-50000.00))/100+ 11000 + income));
		}
		else if ((income >= 80000.00) && (income <= 150000.00))
		{
			System.out.println ("$"+((33*(income-80000))/100+ 21600 + income));
		}
		else 
		{
			System.out.println("-1.0");
		}
		
		}

	

}
