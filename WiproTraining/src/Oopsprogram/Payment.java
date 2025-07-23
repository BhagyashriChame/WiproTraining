package Oopsprogram;

interface Payment {
    void pay(double amount);
}

class PaymentUpi implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Amount paid via UPI: ₹" + amount);
    }
}

class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Amount paid via Credit Card: ₹" + amount);
    }
}

class CashOnDelivery implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Amount paid via Cash on Delivery: ₹" + amount);
    }
}

class EcommerceApp{
    public static void main(String[] args) {
        Payment p;

        p = new PaymentUpi();
        p.pay(100);

        p = new CreditCardPayment();
        p.pay(200);

        p = new CashOnDelivery();
        p.pay(300);
    }
}
