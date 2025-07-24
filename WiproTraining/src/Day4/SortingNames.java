package Day4;
import java.util.Scanner;

import java.util.Arrays;

public class SortingNames {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How my Students are there");
		int students= sc.nextInt();
		sc.nextLine();
		
		String[] str= new String[students];
		
		
		System.out.println("Enter the names : ");
		
		for(int i=0; i<students; i++)
		{
            System.out.print("Student " + (i + 1) + ": ");
			str[i] =sc.nextLine();
		}
		
		Arrays.sort(str);
		

        System.out.println("\nSorted Student Names:");
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
	
		sc.close();
		

	}

}
