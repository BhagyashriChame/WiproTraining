package Day8;
	import java.util.Iterator;
	import java.util.Set;
	import java.util.TreeSet;
	public class Collection_Treeset2 {
	
	    public static void main(String[] args) {
	        Set<String> nameSet = new TreeSet<String>();           // TreeSet for Strings (sorted order)

	        nameSet.add("Bhagyashri");
	        nameSet.add("Aarti");
	        nameSet.add("Neha");
	        nameSet.add("Komal");
	        nameSet.add("Aarti");                                // Duplicate, will be ignored

	        
	        System.out.println(nameSet);

	        Iterator<String> iterator = nameSet.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
}
	    }
	}
