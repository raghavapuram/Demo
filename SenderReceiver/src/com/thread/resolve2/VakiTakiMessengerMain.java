package com.thread.resolve2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * The VakiTakiMessengerMain is the program that send the message once the older message received
 * 
 * @author pavan
 *
 */
public class VakiTakiMessengerMain {

	public static void main(String[] args) throws InterruptedException {

		// shared resource
		VakiTakiMessenger messenger = new VakiTakiMessenger();

		final ExecutorService service = Executors.newFixedThreadPool(2);

		MessageSender sender = new MessageSender(messenger);
		MessageReceiver receiver = new  MessageReceiver(messenger);

		service.execute(sender);
		service.execute(receiver);
	}

}
