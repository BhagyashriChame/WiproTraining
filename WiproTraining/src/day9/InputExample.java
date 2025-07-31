package day9;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class InputExample {
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Enter a Number: ");
		InputStreamReader i= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(i);
		int b= Integer.parseInt(br.readLine());
		
		System.out.println("You entered: " + b);
		br.close();
		i.close();
		
	

	}

}


