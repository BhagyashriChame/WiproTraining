package Oopsprogram;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String value");
		String s=sc.nextLine();
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			char ch=s.charAt(i);
			rev=rev+ch;
		}
		if(rev.equals(s)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not");
		}
		}
	
	}



