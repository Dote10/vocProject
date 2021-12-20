package com.example.vocProject.dto;

import java.sql.Date;

public class Penalty {
	
	private int rowNum;
	private int pid;
	private int deliveryDid;
	private int vocVid;
	private String deliveryCheck;
	private String deliveryAgree;
	private String penaltyWriter;
	private Date penaltyRegdate;
	
	
	public Penalty(){
		
	}
	
	public int getRowNum() {
		return rowNum;
	}
	public void setRowNum(int rowNum) {
		this.rowNum = rowNum;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getDeliveryDid() {
		return deliveryDid;
	}
	public void setDeliveryDid(int deliveryDid) {
		this.deliveryDid = deliveryDid;
	}
	public int getVocVid() {
		return vocVid;
	}
	public void setVocVid(int vocVid) {
		this.vocVid = vocVid;
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
	public void setPenaltyWrite(String penaltyWriter) {
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
		return "Penalty [rowNum=" + rowNum + ", pid=" + pid + ", deliveryDid=" + deliveryDid + ", vocVid=" + vocVid
				+ ", deliveryCheck=" + deliveryCheck + ", deliveryAgree=" + deliveryAgree + ", penaltyWriter="
				+ penaltyWriter + ", penaltyRegdate=" + penaltyRegdate + "]";
	}
	
	
	
}
