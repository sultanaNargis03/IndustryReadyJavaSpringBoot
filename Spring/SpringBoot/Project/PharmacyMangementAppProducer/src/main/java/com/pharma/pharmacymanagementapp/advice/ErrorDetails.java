package com.pharma.pharmacymanagementapp.advice;

import java.time.LocalDateTime;

public class ErrorDetails 
{
	private String statusCode;
	private String errorMessage;
	private LocalDateTime when;

	public ErrorDetails() 
	{
		
	}

	public ErrorDetails(String statusCode, String errorMessage, LocalDateTime when) {
		super();
		this.statusCode = statusCode;
		this.errorMessage = errorMessage;
		this.when = when;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public LocalDateTime getWhen() {
		return when;
	}

	public void setWhen(LocalDateTime when) {
		this.when = when;
	}

	@Override
	public String toString() {
		return "ErrorDetails [statusCode=" + statusCode + ", errorMessage=" + errorMessage + ", when=" + when + "]";
	}
	

}
