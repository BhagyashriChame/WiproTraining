package day10;
import java.util.*;

	public class Collection_Function {
	    public static void main(String[] args) {

	
	        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(20, 10, 30, 40, 10, 50));
	        System.out.println("Original list: " + list);

	                                                                        
	        Collections.sort(list);                                          // 1. sort()
	        System.out.println("Sorted list: " + list);

	        
	        Collections.reverse(list);                                      // 2. reverse()
	        System.out.println("Reversed list: " + list);

	        
	        Collections.shuffle(list);                                     // 3. shuffle()
	        System.out.println("Shuffled list: " + list);

	        Collections.swap(list, 0, 1);                               
	        System.out.println("After swapping index 0 and 1: " + list);

	       
	        int max = Collections.max(list);                                // 5. max()
	        System.out.println("Maximum value: " + max);

	     
	        int min = Collections.min(list);
	        System.out.println("Minimum value: " + min);

	    
	        int freq = Collections.frequency(list, 10);
	        System.out.println("Frequency of 10: " + freq);

	      
	        Collections.sort(list);                                // must be sorted before binary search
	        int index = Collections.binarySearch(list, 30);
	        System.out.println("Index of 30 after sorting: " + index);

	                                                                         // 11. replaceAll()
	        Collections.replaceAll(list, 10, 99);
	        System.out.println("After replacing 10 with 99: " + list);

	        // 12. rotate()
	        Collections.rotate(list, 2); // right rotate by 2
	        System.out.println("After rotating by 2: " + list);

	        
	    
	    }
	}


