package Oopsprogram;


	abstract class EmployeeOne {
	    String name;
	    int empid;

	    public EmployeeOne(String name, int empid) {
	        this.name = name;
	        this.empid = empid;
	    }

	    abstract double calculateSalary();

	    public void display() {
	        System.out.println("Employee Name: " + name);
	        System.out.println("Employee ID: " + empid);
	    }
	}

	class FullTimeEmployee extends EmployeeOne {
	    double monthlySalary;

	    public FullTimeEmployee(String name, int empid, double monthlySalary) {
	        super(name, empid);
	        this.monthlySalary = monthlySalary;
	    }

	    @Override
	    double calculateSalary() {
	        return monthlySalary;
	    }
	}

	class PartTimeEmployee extends EmployeeOne {
	    int hours;
	    double ratePerHour;

	    public PartTimeEmployee(String name, int empid, int hours, double ratePerHour) {
	        super(name, empid);
	        this.hours = hours;
	        this.ratePerHour = ratePerHour;
	    }

	    @Override
	    double calculateSalary() {
	        return hours * ratePerHour;
	    }
	}

	public class PayrollSystem {
	    public static void main(String[] args) {
	        EmployeeOne e1 = new FullTimeEmployee("Chetan", 101, 50000);
	        EmployeeOne e2 = new PartTimeEmployee("Kiran", 102, 80, 30);

	        e1.display();
	        System.out.println("Salary: ₹" + e1.calculateSalary());
	        System.out.println();

	        e2.display();
	        System.out.println("Salary: ₹" + e2.calculateSalary());
	    }
	}
