
public class SimpleCalculator {

	public static void main(String[] args) {
		int a, b;
		a=5;
		b=6;
		
		char sym;
		sym = '*';
		
		int result;
		
		switch(sym) 
		{
		case ('+'): 
			result = a + b;
		System.out.println(result);
		break;
		
		case ('-'):
			result = a - b;
		System.out.println(result);
		break;
		
		case ('*'):
			result = a*b;
		System.out.println(result);
		break;
		
		case ('/'):
			result = a/b;
		System.out.println(result);
		break;
		
		case ('^'):
			result = a^b;
		System.out.println(result);
		break;
		
		default:
			System.out.println("Invalid choice");
			break;
			
		}
		
		

	}

}
