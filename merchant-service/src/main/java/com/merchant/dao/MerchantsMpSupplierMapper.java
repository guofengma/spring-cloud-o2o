package com.merchant.dao;

import org.apache.ibatis.annotations.Param;

import com.merchant.model.MerchantsMpSupplier;

public interface MerchantsMpSupplierMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MerchantsMpSupplier record);

    int insertSelective(MerchantsMpSupplier record);

    MerchantsMpSupplier selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MerchantsMpSupplier record);

    int updateByPrimaryKey(MerchantsMpSupplier record);

	int deleteByMpIdAndMerchantsId(
			@Param("mpId")Integer mpId, 
			@Param("merchantsId")Integer merchantsId);
}