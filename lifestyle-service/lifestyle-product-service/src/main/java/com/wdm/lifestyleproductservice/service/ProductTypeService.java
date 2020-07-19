package com.wdm.lifestyleproductservice.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.wdm.api.product.IProductTypeService;
import com.wdm.common.base.BaseServiceImpl;
import com.wdm.common.base.IBaseDao;
import com.wdm.entity.TProductType;
import com.wdm.mapper.TProductTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * @author wdm
 * @create 2020-07-19 22:29
 **/
@Component
@Service
public class ProductTypeService extends BaseServiceImpl<TProductType> implements IProductTypeService{

    @Autowired
    private TProductTypeMapper productTypeMapper;
    @Override
    public IBaseDao<TProductType> getBaseDao() {
        return productTypeMapper;
    }
}