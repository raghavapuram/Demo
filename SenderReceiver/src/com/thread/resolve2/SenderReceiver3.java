package com.thread.resolve2;

/**
 * This is main class to understand how to handle the shared resource

 * @author pavan
 *
 */
public class SenderReceiver3 {

	public static void main(String[] args) throws InterruptedException {

		// Shared resource
		VakiTakiMessenger data = new VakiTakiMessenger();

		MessageSender sender = new MessageSender(data);
		MessageReceiver receiver = new  MessageReceiver(data);

		Thread t1 = new Thread(sender, "Sender");
		t1.start();

		Thread t2 = new Thread(receiver, "Receiver");
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.print(" Thank you! ");

	}

}
