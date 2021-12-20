package com.example.vocProject.dto;

import java.sql.Date;

public class PenaltyVoc {
	
	private int rowNum;
	private int vid;
	private int pid;
	private int clientCpnClid;
	private int carrierCpnCaid;
	private int deliveryDid;
	private String penaltyCost;
	private String respReason;
	private String vocWrite;
	private Date vocRegdate;
	private String deliveryCheck;
	private String deliveryAgree;
	private String penaltyWriter;
	private Date penaltyRegdate;
	
	
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
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
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
	public String getPenaltyCost() {
		return penaltyCost;
	}
	public void setPenaltyCost(String penaltyCost) {
		this.penaltyCost = penaltyCost;
	}
	public String getRespReason() {
		return respReason;
	}
	public void setRespReason(String respReason) {
		this.respReason = respReason;
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
	public String getDeliveryCheck() {
		return deliveryCheck;
	}
	public void setDeliveryCheck(String deliveryCheck) {
		this.deliveryCheck = deliveryCheck;
	}
	public String getDeliveryAgree() {
		return deliveryAgree;
	}
	public void setDeliveryAgree(String deliveryAgree) {
		this.deliveryAgree = deliveryAgree;
	}
	public String getPenaltyWriter() {
		return penaltyWriter;
	}
	public void setPenaltyWriter(String penaltyWriter) {
		this.penaltyWriter = penaltyWriter;
	}
	public Date getPenaltyRegdate() {
		return penaltyRegdate;
	}
	public void setPenaltyRegdate(Date penaltyRegdate) {
		this.penaltyRegdate = penaltyRegdate;
	}
	
	@Override
	public String toString() {
		return "PenaltyVoc [rowNum=" + rowNum + ", vid=" + vid + ", pid=" + pid + ", clientCpnClid=" + clientCpnClid
				+ ", carrierCpnCaid=" + carrierCpnCaid + ", deliveryDid=" + deliveryDid + ", penaltyCost=" + penaltyCost
				+ ", respReason=" + respReason + ", vocWrite=" + vocWrite + ", vocRegdate=" + vocRegdate
				+ ", deliveryCheck=" + deliveryCheck + ", deliveryAgree=" + deliveryAgree + ", penaltyWriter="
				+ penaltyWriter + ", penaltyRegdate=" + penaltyRegdate + "]";
	}
	
	
	
	
	

}
