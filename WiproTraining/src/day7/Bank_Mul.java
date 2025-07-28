package day7;


	class Bank_mul {
	    private double balance;

	    public Bank_mul(double initialBalance) {
	        this.balance = initialBalance;
	    }

	    public synchronized void deposit(double amount) {
	        balance += amount;
	        System.out.println(Thread.currentThread().getName() + " deposited: " + amount + ", Balance: " + balance);
	    }

	    public synchronized void withdraw(double amount) {
	        if (balance >= amount) {
	            balance -= amount;
	            System.out.println(Thread.currentThread().getName() + " withdrew: " + amount + ", Balance: " + balance);
	        } else {
	            System.out.println(Thread.currentThread().getName() + " failed to withdraw: " + amount + ", Insufficient funds");
	        }
	    }

	    public double getBalance() {
	        return balance;
	    }
	}


