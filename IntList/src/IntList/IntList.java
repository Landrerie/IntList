package IntList;


import java.util.stream.IntStream;

/**
 * Each instance of this class represents a sequence of integers.
 * 
 * @immutable
 */

public class IntList {
	
	/**
	 * @representationObject
	 */	
	private int[] intlist;
	
	/**
	 * @inspects | this
	 * @creates | result
	 * @post | result != null
	 */
	public int[] toIntArray(){
		return intlist.clone();
	}
	
	/**
	 * @inspects | this
	 * @post | result == toIntArray().length
	 */
	public int listlength() {
		return intlist.length;
	}
	
	/**
	 * @pre | 0 <= index && index < listlength()
	 * @inspects | this
	 * @post | result == toIntArray()[index]
	 */
	public int intAt(int index) {
		return intlist[index];
	}
	
	/**
	 * @mutates |
	 * @post | listlength() == 0
	 */
	public IntList() {
		this.intlist = new int[] {};
	}
	
	
	/**
	 * @mutates | this
	 * @post | listlength() == old(listlength()) + 1
	 * @post | toIntArray()[listlength()-1] == item
	 * @post | IntStream.range(0, listlength()-1).allMatch(i -> intAt(i) == old(this).intAt(i))
	 */
	public void addItem(int item) {
		int[] newlist = new int[intlist.length + 1];
		for(int i = 0;i < intlist.length;i++) {
			newlist[i] = intlist[i];
		}
		newlist[intlist.length] = item;
		this.intlist = newlist;
	}
	
	/**
	 * @mutates | this
	 * @post | listlength() == old(listlength()) - 1
	 * @post | IntStream.range(0, listlength()).allMatch(i -> intAt(i) == old(this).intAt(i))
	 */
	public void popItem() {
		int[] newlist = new int[intlist.length - 1];
		for(int i = 0;i < intlist.length - 1;i++) {
			newlist[i] = intlist[i];
		}
		this.intlist = newlist;
	}
	
	
}
