package com.lucascarvalho.workshopmongo.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long timeStamps;
	private Integer status;
	private String error;
	private String messager;
	private String path;
	
	public StandardError() {
		
	}

	public StandardError(Long timeStamps, Integer status, String error, String messager, String path) {
		super();
		this.timeStamps = timeStamps;
		this.status = status;
		this.error = error;
		this.messager = messager;
		this.path = path;
	}

	public Long getTimeStamps() {
		return timeStamps;
	}

	public void setTimeStamps(Long timeStamps) {
		this.timeStamps = timeStamps;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessager() {
		return messager;
	}

	public void setMessager(String messager) {
		this.messager = messager;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	
}
