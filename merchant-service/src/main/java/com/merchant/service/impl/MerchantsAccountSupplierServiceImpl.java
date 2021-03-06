package com.merchant.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.merchant.dao.MerchantsAccountSupplierMapper;
import com.merchant.dto.ResultMessage;
import com.merchant.model.MerchantsAccountSupplier;
import com.merchant.service.MerchantsAccountSupplierService;

@Service
public class MerchantsAccountSupplierServiceImpl implements MerchantsAccountSupplierService {
	
	private final Logger logger = Logger.getLogger(getClass());
	
	@Autowired
	private MerchantsAccountSupplierMapper merchantsAccountSupplierMapper;

	 
	@Override
	public ResultMessage add(MerchantsAccountSupplier data) {
		try {
			merchantsAccountSupplierMapper.insertSelective(data);
		} catch (Exception e) {
			logger.error("添加商户账户中间表记录失败", e);
			return new ResultMessage(false,"插入数据库失败！");
		}
		
		return new ResultMessage(true,"插入数据库成功！",data.getId());
	}

 
 

 
	@Override
	public ResultMessage delete(String accountId, String merchantsId) {
		try {
			int count = merchantsAccountSupplierMapper.delete(accountId,merchantsId);
			if (count < 1) {
				return new ResultMessage(false,"数据不存在！");
			}
		} catch (Exception e) {
			logger.error("删除失败", e);
			return new ResultMessage(false,"删除数据库失败！");
		}
		
		return new ResultMessage(true,"删除成功！");
	}
	
 
	

}
