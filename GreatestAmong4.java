
public class GreatestAmong4 {

	public static void main(String[] args) {
		
		int a,b,c,d,n1,n2, number;
		a=1;
		b=2;
		c=3;
		d=4;
		
	n1 = b > a? b : a;
	n2 = c > n1? c : n1;
	number = d >n2? d : n2;
	System.out.println("Greatest number is " +number);
	

	}

}
