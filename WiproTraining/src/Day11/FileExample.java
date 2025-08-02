package Day11;

import java.io.FileReader;
import java.io.IOException;
public class FileExample{
	public static void main(String args[]) throws IOException{ {
		FileReader reader=new FileReader("C:\\Users\\Bhagyashri Chame\\Documents\\New.txt");
		int ch;
		while((ch=reader.read())!=-1)
		{
			System.out.println((char) ch);
			}
		reader.close(); 
		}
	}
}


