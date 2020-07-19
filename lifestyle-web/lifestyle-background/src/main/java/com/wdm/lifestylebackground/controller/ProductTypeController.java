package com.wdm.lifestylebackground.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wdm.api.product.IProductTypeService;
import com.wdm.entity.TProductType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wdm
 * @create 2020-07-19 22:54
 **/
@RestController
@RequestMapping("productType")
public class ProductTypeController {
    @Reference
    private IProductTypeService productTypeService;

    @GetMapping("list")
    public List<TProductType> list(){
        return productTypeService.list();
    }
}