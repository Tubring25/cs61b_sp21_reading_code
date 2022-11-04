public class Sort {
	public static void sort(String[] x) { 
	   sort(x, 0);
	}
	private static void sort(String[] x, int start) { 
	   if (start == x.length) {
	       return;
	   }
	   int smallestIndex = findSmallest(x);
	   swap(x, start, smallestIndex);
	   sort(x, start + 1);
	}
    public static String findSmallest(String[] x) {
    	// int smallest = x[0];
    	// for (int i = 0;i < x.length; i++) {
    	// 	int cmp = x[i].compareTo(smallest)
    	// 	if(cmp < 0) {
    	// 		smallest = x[i];
    	// 	}
    	// }
    	// return smallest;
    	int smallestIndex = 0;
    	for(int i = 0; i < x.length; i++) {
    		int cmp = x[i].compareTo(x[smallestIndex]);
    		if(cmp < 0) {
    			smallestIndex = i;
    		}
    	}
    	return smallestIndex;
    }
    public static void swap(String[] x, int a, int b) {
	    String temp = x[a];
	    x[a] = x[b];
	    x[b] = temp;
	}
}