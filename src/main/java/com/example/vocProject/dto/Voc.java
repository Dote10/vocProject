package com.example.vocProject.dto;

import java.sql.Date;




public class Voc {
	
	private int rowNum;
	private int vid;
	private int clientCpnClid;
	private int carrierCpnCaid;
	private int deliveryDid;
	private String claimCheck;
	private String compensationCheck;
	private String penaltyCost;
	private String respTarget;
	private String respReason;
	private String vocState;
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
	
	public int getClientCpnClid() {
		return clientCpnClid;
	}
	public void setClientCpnClid(int clientCpnClid) {
		this.clientCpnClid = clientCpnClid;
	}
	public int getCarrierCpnCaid() {
		return carrierCpnCaid;
	}
	public void setCarrierCpnCaid(int carrierCpnCaid) {
		this.carrierCpnCaid = carrierCpnCaid;
	}
	public int getDeliveryDid() {
		return deliveryDid;
	}
	public void setDeliveryDid(int deliveryDid) {
		this.deliveryDid = deliveryDid;
	}
	public String getClaimCheck() {
		return claimCheck;
	}
	public void setClaimCheck(String claimCheck) {
		this.claimCheck = claimCheck;
	}
	public String getCompensationCheck() {
		return compensationCheck;
	}
	public void setCompensationCheck(String compensationCheck) {
		this.compensationCheck = compensationCheck;
	}
	public String getPenaltyCost() {
		return penaltyCost;
	}
	public void setPenaltyCost(String penaltyCost) {
		this.penaltyCost = penaltyCost;
	}
	public String getRespTarget() {
		return respTarget;
	}
	public void setRespTarget(String respTarget) {
		this.respTarget = respTarget;
	}
	public String getRespReason() {
		return respReason;
	}
	public void setRespReason(String respReason) {
		this.respReason = respReason;
	}
	public String getVocState() {
		return vocState;
	}
	public void setVocState(String vocState) {
		this.vocState = vocState;
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
		return "Voc [rowNum=" + rowNum + ", vid=" + vid + ", clientCpnClid=" + clientCpnClid + ", carrierCpnCaid="
				+ carrierCpnCaid + ", deliveryDid=" + deliveryDid + ", claimCheck=" + claimCheck
				+ ", compensationCheck=" + compensationCheck + ", penaltyCost=" + penaltyCost + ", respTarget="
				+ respTarget + ", respReason=" + respReason + ", vocState=" + vocState + ", vocWrite=" + vocWrite
				+ ", vocRegdate=" + vocRegdate + "]";
	}
	
	
	
	
	

}
