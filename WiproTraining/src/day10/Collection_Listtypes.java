package day10;

import java.util.HashSet;
import java.util.LinkedList;

public class Collection_Listtypes {
	public static void main(String[] args) {

        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.addFirst("Orange");                                  // Add at beginning
        fruits.addLast("Grapes");
        
        
        System.out.println("LinkedList (Fruits): " + fruits);
        System.out.println("First fruit: " + fruits.getFirst());
        System.out.println("Last fruit: " + fruits.getLast());
        
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10); 
        numbers.add(30);

        System.out.println("\nHashSet (Numbers): " + numbers);
	}
	}
