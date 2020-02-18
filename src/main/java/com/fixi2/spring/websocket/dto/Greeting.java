package com.fixi2.spring.websocket.dto;

public class Greeting {
	private String content;
	
	public Greeting(){}

	public Greeting(String content) {
		super();
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	};
	
}
