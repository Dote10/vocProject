package com.example.vocProject.dto;

public class carrierCpn {
	
	private int carrierCpnId;
	private String carrierCpnName;
	private String carrierCpnNumber;
	private String carrierCpnManager;
	
	public int getCarrierCpnId() {
		return carrierCpnId;
	}
	public void setCarrierCpnId(int carrierCpnId) {
		this.carrierCpnId = carrierCpnId;
	}
	public String getCarrierCpnName() {
		return carrierCpnName;
	}
	public void setCarrierCpnName(String carrierCpnName) {
		this.carrierCpnName = carrierCpnName;
	}
	public String getCarrierCpnNumber() {
		return carrierCpnNumber;
	}
	public void setCarrierCpnNumber(String carrierCpnNumber) {
		this.carrierCpnNumber = carrierCpnNumber;
	}
	public String getCarrierCpnManager() {
		return carrierCpnManager;
	}
	public void setCarrierCpnManager(String carrierCpnManager) {
		this.carrierCpnManager = carrierCpnManager;
	}
	
	@Override
	public String toString() {
		return "carrierCpn [carrierCpnId=" + carrierCpnId + ", carrierCpnName=" + carrierCpnName + ", carrierCpnNumber="
				+ carrierCpnNumber + ", carrierCpnManager=" + carrierCpnManager + "]";
	}
	
	
	
}
