package com.thread.resolve;


/**
 * This  program about to understand  the handling of shared resource and use of multithreading
 * Note, in this program the Stock Updaters update value by 10 and Receiver should get updated value only
 * @author pavan
 *
 */
public class StockPriceSenderReceiverMain {

	public static void main(String[] args) {
		
		StockPriceToday data = new StockPriceToday();
		
		StockUpdater sender = new StockUpdater(data);
		StockReceiver receiver = new StockReceiver(data);
		
		
		Thread t1 = new Thread(sender, " Sender One");
		t1.start();
		
		Thread t2 = new Thread(receiver);
		t2.start();

		Thread t3 = new Thread(sender , "Sender Two");
		t3.start();

		
		try {
			t1.join();
			t2.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	System.out.println(" Thank you!");	
		
	}

}
