package com.example.vocProject.dto;

public class clientCnp {
	
	private int clientCpnId;
	private String clientCpnName;
	private String clientCpnNumber;
	private String clientCpnManager;
	
	public int getClientCpnId() {
		return clientCpnId;
	}
	public void setClientCpnId(int clientCpnId) {
		this.clientCpnId = clientCpnId;
	}
	public String getClientCpnName() {
		return clientCpnName;
	}
	public void setClientCpnName(String clientCpnName) {
		this.clientCpnName = clientCpnName;
	}
	public String getClientCpnNumber() {
		return clientCpnNumber;
	}
	public void setClientCpnNumber(String clientCpnNumber) {
		this.clientCpnNumber = clientCpnNumber;
	}
	public String getClientCpnManager() {
		return clientCpnManager;
	}
	public void setClientCpnManager(String clientCpnManager) {
		this.clientCpnManager = clientCpnManager;
	}
	
	@Override
	public String toString() {
		return "clientCnp [clientCpnId=" + clientCpnId + ", clientCpnName=" + clientCpnName + ", clientCpnNumber="
				+ clientCpnNumber + ", clientCpnManager=" + clientCpnManager + "]";
	}
	
	
	

}
