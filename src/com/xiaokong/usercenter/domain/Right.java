package com.xiaokong.usercenter.domain;

public class Right {
	
	private int rightId;//权限id 自增长
	private String rightName;//权限名称
	private String desc;//权限描述
	
	public int getRightId() {
		return rightId;
	}
	public void setRightId(int rightId) {
		this.rightId = rightId;
	}
	public String getRightName() {
		return rightName;
	}
	public void setRightName(String rightName) {
		this.rightName = rightName;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	

}
