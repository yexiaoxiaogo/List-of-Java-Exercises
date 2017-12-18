package com.xiaokong.usercenter.domain;

import java.sql.Date;

public class Log {

	private int logId;//日志id
	private int type;//操作类型
	private String content;//操作内容
	private String phoneNum;//操作人手机号
	private Date  dateTime;//操作时间
	
	public int getLogId() {
		return logId;
	}
	public void setLogId(int logId) {
		this.logId = logId;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUserId() {
		return phoneNum;
	}
	public void setUserId(String userId) {
		this.phoneNum = userId;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	
	
	
}
