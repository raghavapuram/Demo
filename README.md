# Demo_MultiThreading
Understand MuliThreading and how to handle the shared resources

#Program 1 (package com.thread)
*  com.thread.SenderReceiver run this main program and observe console log for stock data. 
*  the stock price is not sync between senders and receiver.

####
# Program 2 (package com.thread.resolve)
* StockPriceSenderReceiverMain, This  program about to understand  the handling of shared resource (stockPrice) and use of multithreading.
* if you observe the console log of this program, the stock price is sync between sender(s) and receiver.

###
# Program 3 (package com.thread.resolve2)
* VakiTakiMessengerMain, This program is about understand communication of threads (await and signal)
* The VakiTakiMessenger send message once the older message received by receiver
