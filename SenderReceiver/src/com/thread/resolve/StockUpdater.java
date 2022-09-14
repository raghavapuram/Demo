package com.thread.resolve;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Stock value updater to update the stock value
 * @author pavan
 *
 */
public class StockUpdater implements Runnable {

 	StockPriceToday data;
	
	ReentrantLock lock = new ReentrantLock();

	public StockUpdater(StockPriceToday data) {
		this.data = data;
	}

	@Override
	public void run() {

		double  price = 0;
		try {
			while(true) {
				lock.lock();
				price = data.getValue() + 10;
				data.setValue(price);

				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			lock.unlock();
		}
	}
}
