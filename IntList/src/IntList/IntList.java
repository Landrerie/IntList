package IntList;


import java.util.stream.IntStream;

/**
 * Each instance of this class represents a sequence of integers.
 * 
 * @immutable
 */

public class IntList {
	

		
	private static class Node {	
		private int value;
		/**
		 * @peerObject
		 */
		private Node next;
		
		private Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
	}
	
	private Node first;
	private int length;
	
	/**
	 * @inspects | this
	 * @creates | result
	 * @post | result != null
	 */
	public int[] toIntArray(){
		int[] result = new int[length];
		Node n = first;
		for (int i = 0; i < result.length; i++) {
			result[i] = n.value;
			n = n.next;
		}
		return result;
	}
	
	/**
	 * @inspects | this
	 * @post | result == toIntArray().length
	 */
	public int listlength() {
		return length;
	}
	
	/**
	 * @pre | 0 <= index && index < listlength()
	 * @inspects | this
	 * @post | result == toIntArray()[index]
	 */
	public int intAt(int index) {
		Node n = first;
		for (int i = 0; i <= index; i++) {
			n = n.next;
		}
		return n.value;
	}
	
	/**
	 * @mutates |
	 * @post | listlength() == 0
	 */
	public IntList() {}
	
	
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
