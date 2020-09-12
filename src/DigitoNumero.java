
public class DigitoNumero {
	
	public static void main (String[] args) {
		
		int num = 437;
		System.out.println("Tiene " + contar(num) + " digitos");
	}
	
	public static int contar (int num) {
		
		if (num < 10) {
			
			return 1;
		}
		
		else {
			
			return 1 + contar (num/10);
		}
	}

}
