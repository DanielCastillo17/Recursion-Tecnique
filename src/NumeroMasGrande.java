
public class NumeroMasGrande {
	
	public static void main (String[] args) {
		
		int [] arr = new int[] {14, 23, 34, 45, 10};
		System.out.println("El numero mayor es: " + mayor(arr, 0, 0));
	
	}
	
	public static int mayor (int arr[], int pos, int mayor) {
		
		if(pos < arr.length) {
			
			if(arr[pos]> mayor) {
				
				return mayor (arr, pos + 1, mayor = arr[pos]);
			}
			return mayor; 
		}
		
		else {
			
			return mayor;
		}
	}

}
