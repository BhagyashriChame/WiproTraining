package Day4;

public class RealStateCalc {
    public void calculate(double rent, int food, int expenses) {
    	double total =rent + food + expenses;
    	System.out.println("Total Monthly: "+total);
    }
    
    public void calculate(double rent, int food) {
    	int Expenses=2000;
    	double total= rent+food +Expenses;
    	System.out.println("Total Monthly cost for apartment :" + total);
    }
    public static void main(String args[]) {
    	RealStateCalc calc= new RealStateCalc();
    	calc.calculate(1200,500,3000);
    	calc.calculate(80000, 40000);
    }
}
