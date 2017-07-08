/*
 * Design a class named Queue for storing integers, like a Stack (section 10.6)
 * The elements should be retrieved in a first-in, first-out fashion.
 * The class contains:
 * an int[] elements, that stores the int values in the queue
 * an int size, that stores number of elements in the queue
 * A constructor that creates a Queue object with default size 8
 * The method enqueue(int v) that adds v into queue
 * The method dequeue() that removes and returns the element from the queue
 * the method empty() that retuns true if the queue is empty
 * the method getSize() that returns the size of the queue
 * 
 * When the array is -1 from being full, the size will double
 * when an element is removed from the beginning of the array
 * the whole array shifts one position to the left.
 * 
 * This is a test program that adds 20 numbers from 1-20 into the queue
 * removes these numbers, and then displays the numbers.
 */

import java.util.Arrays;

public class Boot {
	static int size = 8;
	
	public static void main(String[] args) {
		int[] tab = new int[getSize()];
		int num = 0;
		enqueue(-1, tab);
	
		System.out.println(Arrays.toString(tab));
	}
		
	
	public static void enqueue(int n, int[] arr) {
		for (int i=0;i<size;i++) {
			arr[i] = n;
			if (arr[i] <0);
				
		}	
	}
	
	public static int getSize() {
		return size;
	}
	
	
}