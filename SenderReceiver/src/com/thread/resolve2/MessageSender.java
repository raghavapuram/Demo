package com.thread.resolve2;

/**
 * Message Sender
 * @author pavan
 *
 */
public class MessageSender implements Runnable {

	VakiTakiMessenger messenger;

	public MessageSender(VakiTakiMessenger messenger) {
		this.messenger = messenger;

	}

	@Override
	public void run() {

		int  count = 0;
		String msg = "hi ";

		while(true) {
			count++;
			String  finalMsg = msg + count; // creating msg
			try {

				messenger.sendMessage(finalMsg);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}
}
