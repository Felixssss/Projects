package com.gem.springboottest.pojo;

public class Result {
	private int code;
	private String url;
	public Result(int code, String url) {
		super();
		this.code = code;
		this.url = url;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}
