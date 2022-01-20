

package com.example.vocProject.dto;

public class Compensation {
	
	private int compenId;
	private int vocId;
	private String compenCost;
	private String compenState;
	
	public int getCompenId() {
		return compenId;
	}
	public void setCompenId(int compenId) {
		this.compenId = compenId;
	}
	public int getVocId() {
		return vocId;
	}
	public void setVocId(int vocId) {
		this.vocId = vocId;
	}
	public String getCompenCost() {
		return compenCost;
	}
	public void setCompenCost(String compenCost) {
		this.compenCost = compenCost;
	}
	public String getCompenState() {
		return compenState;
	}
	public void setCompenState(String compenState) {
		this.compenState = compenState;
	}
	
	@Override
	public String toString() {
		return "compensation [compenId=" + compenId + ", vocId=" + vocId + ", compenCost=" + compenCost
				+ ", compenState=" + compenState + "]";
	}
	
	
	
	
	

}
