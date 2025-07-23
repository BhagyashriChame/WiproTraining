package Oopsprogram;

import java.util.Scanner;

public class TernaryOperator {

		public static int fact(int n) {
			return (n<=1)?1:n*fact(n-1);
		}
		public static void main(String[] args) {
			System.out.println("enter number");
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			System.out.println(fact(num));
		}
	}

