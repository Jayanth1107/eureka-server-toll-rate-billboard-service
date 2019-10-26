package com.jayanth;

import java.math.BigDecimal;

public class TollRate {
	private int stationdId;
	private BigDecimal currentRate;
	private String timestamp;
	
	public TollRate() {}
	
	public TollRate(int stationdId, BigDecimal currentRate, String timestamp) {
		super();
		this.stationdId = stationdId;
		this.currentRate = currentRate;
		this.timestamp = timestamp;
	}
	public int getStationdId() {
		return stationdId;
	}
	public void setStationdId(int stationdId) {
		this.stationdId = stationdId;
	}
	public BigDecimal getCurrentRate() {
		return currentRate;
	}
	public void setCurrentRate(BigDecimal currentRate) {
		this.currentRate = currentRate;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

}
