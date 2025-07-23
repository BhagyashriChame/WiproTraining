package Oopsprogram;

import java.util.Scanner;

public class PrimeNumberp {
	public static boolean isPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter");
	
	int num=sc.nextInt();
	if(isPrime(num) && num>1) {
		System.out.println("prime number");
	}
	else {
		System.out.println("not");
	}
}
}
