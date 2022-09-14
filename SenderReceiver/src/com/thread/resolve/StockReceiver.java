package com.thread.resolve;


/**
 * Stock value receiver
 * @author pavan
 *
 */
public class StockReceiver implements Runnable {

	StockPriceToday data;

	public StockReceiver(StockPriceToday data) {
		this.data = data;
	}

	@Override
	public void run() {
		while(true) {
			System.out.println(" Received Stock value " + data.getValue());
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}
}
