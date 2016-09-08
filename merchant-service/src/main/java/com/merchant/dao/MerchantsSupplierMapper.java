package com.merchant.dao;

import java.util.List;

import com.merchant.form.CommonFrom;
import com.merchant.form.MerchantsQueryBean;
import com.merchant.model.MerchantsSupplier;

public interface MerchantsSupplierMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MerchantsSupplier record);

    int insertSelective(MerchantsSupplier record);

    MerchantsSupplier selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MerchantsSupplier record);

    int updateByPrimaryKey(MerchantsSupplier record);

	List queryByPage(CommonFrom<MerchantsQueryBean> from);
	
}