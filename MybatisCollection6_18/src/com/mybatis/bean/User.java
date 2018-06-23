package com.mybatis.bean;

import java.util.List;

public class User {
	private int uId;
	private String uName;
	private int uAge;
	private int roleId;
	private List<Address> addressList;
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public int getuAge() {
		return uAge;
	}
	public void setuAge(int uAge) {
		this.uAge = uAge;
	}
	
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	@Override
	public String toString() {
		return "User [uId=" + uId + ", uName=" + uName + ", uAge=" + uAge + ", roleId=" + roleId + ", addressList="
				+ addressList + "]";
	}

}
