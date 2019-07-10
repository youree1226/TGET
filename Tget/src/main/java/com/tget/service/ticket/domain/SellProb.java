package com.tget.service.ticket.domain;

public class SellProb {
	
	private int highPrice;
	private int lowPrice;
	private int totalCount;
	private int sellprob;
	
	public SellProb() {
		// TODO Auto-generated constructor stub
	}

	public int getHighPrice() {
		return highPrice;
	}

	public void setHighPrice(int highPrice) {
		this.highPrice = highPrice;
	}

	public int getLowPrice() {
		return lowPrice;
	}

	public void setLowPrice(int lowPrice) {
		this.lowPrice = lowPrice;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getSellprob() {
		return sellprob;
	}

	public void setSellprob(int sellprob) {
		this.sellprob = sellprob;
	}

	@Override
	public String toString() {
		return "SellProb [highPrice=" + highPrice + ", lowPrice=" + lowPrice + ", totalCount=" + totalCount
				+ ", sellprob=" + sellprob + "]";
	}
	
	

}
