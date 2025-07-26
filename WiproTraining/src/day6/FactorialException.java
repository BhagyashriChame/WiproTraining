package day6;

public class FactorialException {
	public static void main(String arga[]) {
		try {
			int num =5;
			int fact=1;
			for(int i = 1; i <= num; i++) {
				fact = fact * i;
			}
			System.out.println("Factorial no is :" +fact);
		}
		catch(IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
			} 
		finally{
			System.out.println("Program executed.");
			}
		}
	}
  

