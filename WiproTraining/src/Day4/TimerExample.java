package Day4;

import java.util.Timer;
import java.util.TimerTask;


public class TimerExample {
public static void main(String[] args)  {
	
	while(true) {
		java.time.LocalTime now=java.time.LocalTime.now();
		int hourtime=now.getHour();
		
		if(hourtime==13) {
			System.out.println("lunch break remainder");
		}
		else if(hourtime==15) {
			System.out.println("tea break");
		}
		else {
			System.out.println("complete pending work...........");
		}
		try {
			Thread.sleep(3600000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
}