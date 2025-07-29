package day7;
	                                                          
	class TicketBooking extends Thread {                               //  Ticket Booking
	    public void run() {
	        System.out.println("Booking ticket for user...");
	        try {
	            Thread.sleep(10);                                      // simulate delay
	        } catch (InterruptedException e) {}
	        System.out.println("Ticket booked successfully!");
	    }
	}

	class CreditCardProcessing extends Thread {                       //Credit Card Processing
	    public void run() {
	        System.out.println("Processing credit card payment...");
	        try {
	            Thread.sleep(40);                                     // simulate delay
	        } catch (InterruptedException e) {}
	        System.out.println("Payment processed successfully!");
	    }
	}

	public class TicketBookingSystem {
	    public static void main(String[] args) {
	        TicketBooking booking = new TicketBooking();
	        CreditCardProcessing payment = new CreditCardProcessing();

	        booking.start();
	        try {
				Thread.sleep(10);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
				
			}
	        
	        payment.start();
	    }
	
	}


