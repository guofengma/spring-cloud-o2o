package com.icloud.service.impl;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.icloud.common.ServiceUrlContants;
import com.icloud.dto.BaseDto;
import com.icloud.dto.MpDetailDto;
import com.icloud.dto.MpQueryDto;
import com.icloud.model.MerchantsMp;
import com.icloud.service.MerchantsMpService;


@Service
public class MerchantsMpServiceImpl extends BaseServiceImple implements MerchantsMpService{
	

	/**
	 * 添加公众号
	 * @param request
	 * @return
	 */
	public Object add(String jsonParams) { 
		BaseDto addDto = doPost(ServiceUrlContants.mct_mp_add, jsonParams,BaseDto.class);
		return addDto;
	}
	
	/**
	 * 获取当前账户所管理的公众号列表
	 * @param access_token
	 * @param data
	 * @return
	 */
	public Object list(int accountId,String data) {
		JSONObject jsonObj = JSONObject.parseObject(data);
		jsonObj.put("accountId", accountId);
		MpQueryDto queryDto = doPost(ServiceUrlContants.mct_mp_list, jsonObj,MpQueryDto.class);
		return queryDto;
		
	}
	
 
	/**置为不可用**/
	public Object mpDisable(String mpId) { 
		MpDetailDto mpDeDto = null;  
		BaseDto baseDto = null;
		String rType = "";
		String rCode = ""; 
		
		mpDeDto = doGet(ServiceUrlContants.mct_mp_query+"?id="+mpId,MpDetailDto.class ); //查询Mp
		rType = mpDeDto.getResultType();
		rCode = mpDeDto.getResultCode();  
		if ("success".endsWith(rType) && "10000".endsWith(rCode) ) { 
			MerchantsMp mp = mpDeDto.getMp();
			mp.setUseStatus("0");//设置不启用
			JSONObject jsonObj = (JSONObject) JSONObject.toJSON(mp);
			baseDto = doPost(ServiceUrlContants.mct_mp_update,jsonObj,BaseDto.class); //修改Mp不可用
			rType = baseDto.getResultType();
			rCode = baseDto.getResultCode(); 
			if ("success".endsWith(rType) && "10000".endsWith(rCode) ) { 
				baseDto = doGet(ServiceUrlContants.mct_mp_merchants_del+"?mpId="+mpId,BaseDto.class);//删除公众号与商户关联
			}
		}
		
		return baseDto;
	}

}