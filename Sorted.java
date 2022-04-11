
public class Sorted{ 
	
	public Sorted() {
		
	}
	public static <T extends Comparable<T>> String insertionSort (T[]arr) { //metodo generico T,U,K
		
		for(int j=1; j< arr.length;j++) { 
			T actual = arr[j];			
			
			int i = j-1;						
			while(i>=0 && (arr[i].compareTo(actual)> 0)) { 
				arr[i+1]=arr[i]; 
				i--;						
			}
			arr[i+1] = actual;  
		}

		return "\nArray de " + arr.length + " elementos\n";
		
	}
	
	public static <T> void listAll(T[] a) {
		System.out.println("Lista ordenada ");
		for(T element: a) 
			System.out.printf(element+" ");
	}
	
	public static <T> void SearchItem(T[]a,T val) {
		System.out.println("\nBuscando... ");
		int i=0;
		for(T e : a) {
			if(e == val) {
				System.out.println("Se encontro el dato "+e);
				i=1;
			}
		}
		if(i==0)
			System.out.println("NULL ");
		
	}
}
