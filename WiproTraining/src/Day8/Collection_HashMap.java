package Day8;
	import java.util.HashMap;
	import java.util.Map;
	public class Collection_HashMap {
	
	    public static void main(String[] args) {   
	        HashMap<String, Integer> studentMarks = new HashMap<>();
     
	        studentMarks.put("Ravi", 85);
	        studentMarks.put("Sneha", 92);
	        studentMarks.put("Amit", 78);
	        studentMarks.put("Priya", 88);

	        System.out.println("Student Marks:");
	        for (String name : studentMarks.keySet()) {
	            int marks = studentMarks.get(name);
	            System.out.println(name + " = " + marks);
	        }
	    }
	}


