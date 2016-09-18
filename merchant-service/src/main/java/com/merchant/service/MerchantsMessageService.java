package com.merchant.service;

import java.util.List;

import com.merchant.dto.ResultMessage;
import com.merchant.form.CommonFrom;
import com.merchant.form.MerchantsMessageBean;
import com.merchant.model.MerchantsMessage;


public interface MerchantsMessageService {

	ResultMessage add(MerchantsMessage data);

	ResultMessage queryByPage(CommonFrom<MerchantsMessageBean> form);

	ResultMessage update(MerchantsMessage data);

	ResultMessage findById(Integer id);
	 
	
}
