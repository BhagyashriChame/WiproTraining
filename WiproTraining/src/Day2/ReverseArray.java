package Day2;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array length");
		int size = sc.nextInt();
		int a[] = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int rev = 0;
		for (int i = a.length - 1; i >= 0; i--) {
		
		System.out.print(a[i]+" ");
	}
	}
}

