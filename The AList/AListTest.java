import org.junit.Test;
import static org.junit.Assert.*;

public class AListTest {
	
	@Test
	public void emptyAListTest() {
		AList L = new AList();
		assertEquals(0, L.size());
	}

	@Test
	public void addLastTest() {
		AList L = new AList();
		L.addLast(1);
		L.addLast(2);
		assertEquals(2, L.size());
	}

	@Test 
	public void getLastTest() {
		AList L = new AList();
		L.addLast(1);
		assertEquals(1, L.size());
		assertEquals(1, L.getLast());
	}

	@Test
	public void removeLastTest() {
		AList L = new AList();
		L.addLast(1);
		L.addLast(2);
		L.addLast(3);

		assertEquals(3, L.size());

		int last = (int) L.removeLast();
		assertEquals(2, L.size());
		assertEquals(3, last);

	}
}