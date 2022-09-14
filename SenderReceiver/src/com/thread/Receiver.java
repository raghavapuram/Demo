package com.thread;

public class Receiver implements Runnable {

	StockData data;

	public Receiver(StockData data) {
		this.data = data;
	}

	@Override
	public void run() {
		while(true) {
			data.getValue();
			System.out.println(" Receiver Thread, stock price = " + data.getValue());

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}
}
