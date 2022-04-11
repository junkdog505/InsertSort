public class InsertionSort {
	public static void main (String []args) {
		int []arr = {5,3,4,8,7,5,1,3,2};
		
		System.out.print("Array desordenado: ");
		listar(arr);	//Array before sort
		
		//InsertionSort
		for(int j=1; j<arr.length; j++) {
			int actual = arr[j];
			
			int i=j-1;
			
			while(i >= 0 && arr[i] > actual) {
				arr[i+1] = arr[i];
				i--;
			}
			
			arr[i+1] = actual;
			
		}
		
		System.out.print("Array ordenado   : ");
		listar(arr);	//Array after sort
		
	}
	
	public static void listar(int []arr) {
		System.out.print("[");
		for(int x=0; x < arr.length; x++) {
			
			if(x < arr.length - 1) {
				System.out.print(arr[x] + ",");
			}else{
				System.out.print(arr[x]);
			}
			
		}
		System.out.print("] \n");
	}
}