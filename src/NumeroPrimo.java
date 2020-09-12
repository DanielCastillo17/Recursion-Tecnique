
public class NumeroPrimo {
	
	public static void main (String [] args ) {
		
		boolean primo = primo(12, 4);
		
		if(primo = false) {
			
			System.out.println("Es primo ");
		}
		
		else {
			System.out.println("No es Primo ");
		}
		
		
	}

	private static boolean primo(int num, int divisor) {
		
		if(num/2 < divisor) {
			
			return true;
		}
			
	
	else {
		
		if (num % divisor == 0) {
			
		}

	}
		return false;
		
		
	}	

}
