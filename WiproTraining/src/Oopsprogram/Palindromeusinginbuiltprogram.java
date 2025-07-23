package Oopsprogram;

import java.util.Scanner;

public class Palindromeusinginbuiltprogram {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			String s=sc.nextLine();
			String rev= new StringBuilder(s).reverse().toString();
			System.out.println(s.equals(rev)?"is palindrome":"is not");
		}
		}

