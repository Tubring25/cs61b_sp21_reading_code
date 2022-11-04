public class TestSort {
	/** Tests the sort method of the Sort class. */
    public static void testSort() {
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};
        Sort.sort(input);
        org.junit.Assert.assertArrayEquals(expected, input);
    }

    public static void main(String[] args) {
        testSort();
    }

    public static void testFindSmallest() {
    	String[] input = {"i", "have", "an", "egg"};
	    String expected = "an";

	    String actual = Sort.findSmallest(input);
	    org.junit.Assert.assertEquals(expected, actual);        

	    String[] input2 = {"there", "are", "many", "pigs"};
	    String expected2 = "are";

	    String actual2 = Sort.findSmallest(input2);
	    org.junit.Assert.assertEquals(expected2, actual2);
    }
    public static void testSwap() {
        String[] input = {"i", "have", "an", "egg"};
        int a = 0;
        int b = 2;
        String[] expected = {"an", "have", "i", "egg"};

        Sort.swap(input, a, b);
        org.junit.Assert.assertArrayEquals(expected, input);
    }
}