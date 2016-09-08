package com.merchant.dto;

import com.merchant.model.MerchantsAccount;

/**
 * 商户帐户 账号密码验证Dto
 * 
 * @author luoqw 2016-9-7上午10:10:57
 */
public class MerchantsAccountLoginCheckResDto {
	
	private String resultType;
	private String resultCode;
	private String errorMsg;
	private boolean resultCheck;
	private MerchantsAccount account;

	public MerchantsAccountLoginCheckResDto(String resultType, String resultCode, boolean resultCheck,
			MerchantsAccount account) {
		super();
		this.resultType = resultType;
		this.resultCode = resultCode;
		this.resultCheck = resultCheck;
		this.account = account;
	}

	public MerchantsAccountLoginCheckResDto(String resultType, String resultCode, String errorMsg) {
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

	public boolean isResultCheck() {
		return resultCheck;
	}

	public void setResultCheck(boolean resultCheck) {
		this.resultCheck = resultCheck;
	}

	public MerchantsAccount getAccount() {
		return account;
	}

	public void setAccount(MerchantsAccount account) {
		this.account = account;
	}

}
