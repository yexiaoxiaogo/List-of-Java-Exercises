package com.xiaokong.usercenter.domain;

public class Message {
	
	private int id;
	private String code;//验证码
	private String exoiry;//短信失效时间
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getExoiry() {
		return exoiry;
	}
	public void setExoiry(String exoiry) {
		this.exoiry = exoiry;
	}

}
