package com.thread.resolve2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 *  The VakiTakiMessenger,  the VakiTakiMessenger send message once the older message received
 *   
 * @author pavan
 *
 */
public class VakiTakiMessenger {


	private String message;

	private ReentrantLock msgLock = new ReentrantLock();
	private Condition writeCondition = msgLock.newCondition();
	private Condition readCondition = msgLock.newCondition();


	/**
	 * Get message and send signal to sender and wait for other message
	 * @return msg
	 * @throws InterruptedException
	 */
	public  String getMessage() throws InterruptedException {
		try {	
			msgLock.lock();
			System.out.println(" received msg, " + this.message);
			writeCondition.signalAll();
			readCondition.await();
		}finally {
			msgLock.unlock();
		}
		return this.message;
	}

	/**
	 * Send message and wait for signal
	 * @param msg
	 * @throws InterruptedException
	 */
	public  void sendMessage(String msg) throws InterruptedException {
		try {	
			msgLock.lock();

			this.message = msg;
			System.out.println(" send msg, " + this.message);
			readCondition.signalAll();
			writeCondition.await();
		}finally {
			msgLock.unlock();
		}

	}



}
