package com.thread.resolve;

/**
 *  The StockPriceToday,  the current value of Stock
 *   
 * @author pavan
 *
 */
public class StockPriceToday {
	
    private double value;

	public  double getValue() {

		return this.value;
	}

	public  void setValue(final double value) {
			this.value = value;
			
		System.out.println("Stock value update to " + value);
	}
	
	
	
	

}
