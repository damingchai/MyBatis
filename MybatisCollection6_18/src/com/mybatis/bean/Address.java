package com.mybatis.bean;

public class Address {
	private int aId;
	private String aName;
	private int userId;
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "Address [aId=" + aId + ", aName=" + aName + ", userId=" + userId + "]";
	}
	

}
