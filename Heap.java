package f;
/*It is a storage class in java
The heap is a special class where the numbers everyone follows either 
the smallest number is always on top like minimum heap or the biggest number 
always on top like max heap
 */
import java.util.*;
public class Heap {
	 public static void main(String[] args) {
	        PriorityQueue<Integer> minheap = new PriorityQueue<>();
	        minheap.add(20);
	        minheap.add(5);
	        minheap.add(15);
	        minheap.add(10);

	        System.out.println("Min Heap output : ");
	        while (!minheap.isEmpty()) {
	            System.out.print(minheap.poll() + " ");
	        }

	        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
	        maxheap.add(20);
	        maxheap.add(5);
	        maxheap.add(15);
	        maxheap.add(10);

	        System.out.println("\nMax Heap output : ");
	        while (!maxheap.isEmpty()) {
	            System.out.print(maxheap.poll() + " ");
	        }
	    }

	

}
