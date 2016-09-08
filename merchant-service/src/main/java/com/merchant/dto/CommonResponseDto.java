package com.merchant.dto;

public class CommonResponseDto<T> {

	private String resultType;
	private String resultCode;
	private String errorMsg;
	private T mp;
	
	
	public CommonResponseDto() {
		
	}
	
	public CommonResponseDto(String resultType, String resultCode) {
		super();
		this.resultType = resultType;
		this.resultCode = resultCode; 
	}
	
	public CommonResponseDto(String resultType, String resultCode, String errorMsg) {
		super();
		this.resultType = resultType;
		this.resultCode = resultCode;
		this.errorMsg = errorMsg;
	}

	public String getResultType() {
		return resultType;
	}

	public void setResultType(String resultType) {
		this.resultType = resultType;
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public T getMp() {
		return mp;
	}

	public void setMp(T mp) {
		this.mp = mp;
	}
	
	

}
