package com.fangzhou.main;

public class Video {
	private String name;
	private String contentType;
	private String returnVal;
	
	public Video (String name, String contentType, String returnVal) {
		this.name = name;
		this.contentType = contentType;
		this.returnVal = returnVal;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public String getReturnVal() {
		return returnVal;
	}
	public void setReturnVal(String returnVal) {
		this.returnVal = returnVal;
	}
}
