package Practice;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
public static void main(String args[]) {
	List<Integer>item=new ArrayList<Integer>();
	item.add(34);
	item.add(46);
	item.add(78);
	item.add(26);
	//System.out.println(item);
	for(Object i:item) {
		int item1=(Integer)i;
		System.out.println(item1);
	}
	
}
}
