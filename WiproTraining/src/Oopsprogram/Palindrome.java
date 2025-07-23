package Oopsprogram;

	import java.util.Scanner;

	public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int temp=n;
		int rev=0;
		while(temp>0) {
			
			int d=temp%10;  //121
			rev=rev*10+d;
			temp=temp/10;
		}
		temp=n;
		if(rev==temp) {
			System.out.println("palindrome");
		}
		
		else {
			System.out.println("not palindrome");
		}
		}
	}

