package Day2;

public class CompareStringMutabal {

		public static void main(String[] args) {
			String s="hello";
			s.concat("world");
			System.out.println("immutable :"+s);
			
			StringBuilder sb=new StringBuilder("hello");
			sb.append("world");
			System.out.println("mutable: "+sb);
			StringBuffer buffer=new StringBuffer("hello");
			buffer.append("world");
			System.out.println("mutable: "+buffer);
					
		}
		}

