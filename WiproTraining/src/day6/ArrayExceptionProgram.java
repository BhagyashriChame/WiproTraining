package day6;

public class ArrayExceptionProgram {
	public static void main(String args[]) {
		try {
			int [] numbers = {10, 20,30,40,50};
			System.out.println("Element at index :" + numbers[4]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: You are trying to access an index that does not exist.");
        }
        finally {
            System.out.println("Program executed.");
		}
	}
}
