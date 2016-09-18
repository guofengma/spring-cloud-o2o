package com.merchant.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.merchant.dto.BaseDto;
import com.merchant.dto.ResultMessage;
import com.merchant.model.MerchantsAccount;
import com.merchant.model.MerchantsAccountMp;
import com.merchant.service.MerchantsAccountMpService;
import com.merchant.util.RequestUtil;

@RestController
public class MerchantsAccountMpController {

 
    @Autowired
	private MerchantsAccountMpService mtsAccountMpService;

    /**3.1 添加接口*/
	@RequestMapping(value = "/account_mp/add", method = RequestMethod.POST)
	public Object add(HttpServletRequest request) {
		String jsonText = RequestUtil.readPostContent(request);
		MerchantsAccountMp data = JSONObject.parseObject(jsonText, MerchantsAccountMp.class);
		ResultMessage result = mtsAccountMpService.add(data);
		if (result.isSuccess()) {
			return new BaseDto("success","10000");
		}
		
		return new BaseDto("success","90001");
	}
	
 
	/**3.2 删除接口*/
	@RequestMapping(value = "/account_mp/del", method = RequestMethod.POST)
	public Object del(HttpServletRequest request) {
		JSONObject jsonObj = RequestUtil.readToJSONObect(request);
		Integer mpId = jsonObj.getInteger("mpId");
		Integer accountId = jsonObj.getInteger("accountId");
		if (mpId == null && accountId == null) {
			return new BaseDto("success","10001");
		}
		ResultMessage result = mtsAccountMpService.deleteByAccountIdAndMpId(accountId,mpId);
		if (result.isSuccess()) {
			return new BaseDto("success","10000");
		}
		
		return new BaseDto("success","90001");
	}
	
	
 
	
 
	
	
	
	
    

}