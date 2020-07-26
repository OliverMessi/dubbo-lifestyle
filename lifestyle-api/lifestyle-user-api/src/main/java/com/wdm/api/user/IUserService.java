package com.wdm.api.user;

import com.github.pagehelper.PageInfo;
import com.wdm.common.base.IBaseService;
import com.wdm.entity.TUser;

/**
 * @author wdm
 * @create 2020-07-26 15:35
 **/
public interface IUserService  extends IBaseService<TUser> {
    @Override
    PageInfo<TUser> page(Integer pageIndex, Integer pageSize);
}