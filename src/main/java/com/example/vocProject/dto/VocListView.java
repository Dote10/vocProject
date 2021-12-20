package com.example.vocProject.dto;

import java.sql.Date;

public class VocListView {
	
	private int rowNum;
	private int vid;
	private int carrierCpnCaid;
	private String respTarget;
	private String deliveryCheck;
	private String vocWrite;
	private Date vocRegdate;
	
	public int getRowNum() {
		return rowNum;
	}
	public void setRowNum(int rowNum) {
		this.rowNum = rowNum;
	}
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public int getCarrierCpnCaid() {
		return carrierCpnCaid;
	}
	public void setCarrierCpnCaid(int carrierCpnCaid) {
		this.carrierCpnCaid = carrierCpnCaid;
	}
	public String getRespTarget() {
		return respTarget;
	}
	public void setRespTarget(String respTarget) {
		this.respTarget = respTarget;
	}
	public String getDeliveryCheck() {
		return deliveryCheck;
	}
	public void setDeliveryCheck(String deliveryCheck) {
		this.deliveryCheck = deliveryCheck;
	}
	public String getVocWrite() {
		return vocWrite;
	}
	public void setVocWrite(String vocWrite) {
		this.vocWrite = vocWrite;
	}
	public Date getVocRegdate() {
		return vocRegdate;
	}
	public void setVocRegdate(Date vocRegdate) {
		this.vocRegdate = vocRegdate;
	}
	
	@Override
	public String toString() {
		return "VocListView [rowNum=" + rowNum + ", vid=" + vid + ", carrierCpnCaid=" + carrierCpnCaid + ", respTarget="
				+ respTarget + ", deliveryCheck=" + deliveryCheck + ", vocWrite=" + vocWrite + ", vocRegdate="
				+ vocRegdate + "]";
	}
	
	
	
	
	
}
