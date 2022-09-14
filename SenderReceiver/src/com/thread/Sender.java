package com.thread;

public class Sender implements Runnable {


	StockData data;

	public Sender(StockData data) {
		this.data = data;
	}


	@Override

	public void run() {
		double  price = 0;
		try {
			while(true) {
				price = price + 10;
				data.setValue(price);
				System.out.println(" Sender Thread  "+ Thread.currentThread().getName() + ", stock price = " + data.getValue());
				Thread.sleep(1);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

