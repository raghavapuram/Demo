package com.thread;

/**
 * Run this program and observe console log for stock data. 
 * the stock price is not sync between senders and receiver
 * @author pavan
 *
 */
public class SenderReceiver {

	public static void main(String[] args) {

		StockData data = new StockData();
		
		Sender sender = new Sender(data);
		Receiver receiver = new Receiver(data);
		
		
		Thread t1 = new Thread(sender, " t1");
		t1.start();
		
		Thread t2 = new Thread(receiver);
		t2.start();

		Thread t3 = new Thread(sender , "t3");
		t3.start();

		
		try {
			t1.join();
			t2.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	System.out.println(" Thank you");	
		
	}

}
