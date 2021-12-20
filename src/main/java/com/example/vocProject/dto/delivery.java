package com.example.vocProject.dto;

public class delivery {
	
	private int deliveryId;
	private String deliveryName;
	private String deliveryArea;
	private String deliveryNumber;
	private int carrierCpnId;
	
	public int getDeliveryId() {
		return deliveryId;
	}
	public void setDeliveryId(int deliveryId) {
		this.deliveryId = deliveryId;
	}
	public String getDeliveryName() {
		return deliveryName;
	}
	public void setDeliveryName(String deliveryName) {
		this.deliveryName = deliveryName;
	}
	public String getDeliveryArea() {
		return deliveryArea;
	}
	public void setDeliveryArea(String deliveryArea) {
		this.deliveryArea = deliveryArea;
	}
	public String getDeliveryNumber() {
		return deliveryNumber;
	}
	public void setDeliveryNumber(String deliveryNumber) {
		this.deliveryNumber = deliveryNumber;
	}
	public int getCarrierCpnId() {
		return carrierCpnId;
	}
	public void setCarrierCpnId(int carrierCpnId) {
		this.carrierCpnId = carrierCpnId;
	}
	
	@Override
	public String toString() {
		return "delivery [deliveryId=" + deliveryId + ", deliveryName=" + deliveryName + ", deliveryArea="
				+ deliveryArea + ", deliveryNumber=" + deliveryNumber + ", carrierCpnId=" + carrierCpnId + "]";
	}
	
	
	

}
