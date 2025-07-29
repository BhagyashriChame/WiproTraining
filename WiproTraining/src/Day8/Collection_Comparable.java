package Day8;

	import java.util.Arrays;
	import java.util.Collections;
	import java.util.List;

	class Collection_Comparable implements Comparable<Collection_Comparable> {
	    private String name;
	    private int age;

	    public Collection_Comparable(String n, int a) {
	        this.name = n;
	        this.age = a;
	    }

	    
	    public int compareTo(Collection_Comparable other) {
	        return this.age - other.age;
	    }

	    
	    public String toString() {
	        return name + " (" + age + ")";
	    }

	    public static void main(String[] args) {
	        List<Collection_Comparable> a = Arrays.asList(
	            new Collection_Comparable("Bhagyashri", 50),
	            new Collection_Comparable("Gitanjali", 20)
	        );

	        Collections.sort(a);                                  // sorts using compareTo()

	        System.out.println(a);                                   // calls toString() for each object
	    }
	}


