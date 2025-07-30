package day9;

	import java.io.FileInputStream;
	import java.io.IOException;
	import java.io.ObjectInputStream;

	public class DeserializationProgram {

		public static void main(String[] args) {
			try {
				FileInputStream filein = new FileInputStream("File1.txt");
				ObjectInputStream in = new ObjectInputStream(filein);
				
				A obj = (A)in.readObject();
				in.close();
				filein.close();
				
				System.out.println("deserialization object : ");
				System.out.println("Name "+obj.getName());
				System.out.println("Age "+obj.getAge());
			} catch (IOException | ClassNotFoundException e) {
				e.printStackTrace();
			}
		}

	}

