package Day1;

public class Calculator_Runtimedata {
	public int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
    	Calculator_Runtimedata calc = new Calculator_Runtimedata();
        int sum = calc.add(3, 4);
        System.out.println("Sum = " + sum);
    }
}


