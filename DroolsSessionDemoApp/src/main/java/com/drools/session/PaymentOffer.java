package com.drools.session;

public class PaymentOffer {
	private String channel;
	private int discount;
	private String festival;
	private boolean firstTimeCustomer;

	/**
	 * @return the festival
	 */
	public String getFestival() {
		return festival;
	}

	/**
	 * @param festival the festival to set
	 */
	public void setFestival(String festival) {
		this.festival = festival;
	}

	/**
	 * @return the firstTimeCustomer
	 */
	public boolean isFirstTimeCustomer() {
		return firstTimeCustomer;
	}

	/**
	 * @param firstTimeCustomer the firstTimeCustomer to set
	 */
	public void setFirstTimeCustomer(boolean firstTimeCustomer) {
		this.firstTimeCustomer = firstTimeCustomer;
	}

	/**
	 * @return the channel
	 */
	public String getChannel() {
		return channel;
	}

	/**
	 * @param channel the channel to set
	 */
	public void setChannel(String channel) {
		this.channel = channel;
	}

	/**
	 * @return the discount
	 */
	public int getDiscount() {
		return discount;
	}

	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(int discount) {
		this.discount = discount;
	}

}