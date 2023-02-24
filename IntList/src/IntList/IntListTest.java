package IntList;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class IntListTest {

	@Test
	void test() {
		IntList testintlist = new IntList();
		assertArrayEquals(new int[] {}, testintlist.toIntArray());
		assertEquals(0, testintlist.listlength());
		testintlist.addItem(5);
		testintlist.addItem(6);
		assertArrayEquals(new int[] {5, 6}, testintlist.toIntArray());
		assertEquals(6, testintlist.intAt(1));
		testintlist.popItem();
		assertArrayEquals(new int[] {5}, testintlist.toIntArray());
		
	}

}
