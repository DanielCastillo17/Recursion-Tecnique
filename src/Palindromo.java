
public class Palindromo {
	
	public static void main (String[] args) {
		
		int[] arr = new int[] {4, 6, 3, 10};
		int fin = arr.length;
		
		System.out.println(palindromo(arr, 0, fin - 1));
	}
	
	public static int palindromo(int arr[], int inicio, int fin) {
		
		if (inicio > fin) {
			
			return 1;
		}
		
		else {
			
			if(arr [inicio] == arr[fin]) {
				
				return palindromo(arr, inicio + 1, fin - 1);
			}
			
			else {
				
				return 0;
			}
		}
	}

}
