package com.thread.resolve2;

/**
 * Message receiver
 * @author pavan
 *
 */
public class MessageReceiver implements Runnable {

	VakiTakiMessenger messenger;

	public MessageReceiver(VakiTakiMessenger messenger) {
		this.messenger = messenger;
	}

	@Override
	public void run() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		while(true) {
			try {
				messenger.getMessage();
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}
	}
}
