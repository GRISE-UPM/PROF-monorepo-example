package es.upm.grise.prof.pipelines;

public class JavaClassThatUsesQuicksort {

	static int [] arr = {3, 1, 6, 4, 9, 8};
	static int low = 0;
	static int high = arr.length - 1;
	
	public static void main(String[] args) { 
		
		System.out.print("Input array : {");
	    
	    for (int i = low; i < high; i++)
	    	System.out.print(arr[i] + ", ");
	    
	    System.out.println(arr[high] + "}");

	    // Sorting
		Quicksort.INSTANCE.quicksort(arr, low, high);
		
	    System.out.print("Sorted array: {");
	    
	    for (int i = low; i < high; i++)
	    	System.out.print(arr[i] + ", ");
	    
	    System.out.println(arr[high] + "}");
	}

}
