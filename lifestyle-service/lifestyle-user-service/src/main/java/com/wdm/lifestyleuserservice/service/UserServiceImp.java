package com.wdm.lifestyleuserservice.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wdm.api.user.IUserService;
import com.wdm.common.base.BaseServiceImpl;
import com.wdm.common.base.IBaseDao;
import com.wdm.entity.TUser;
import com.wdm.mapper.TUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author wdm
 * @create 2020-07-26 16:11
 **/
@Component
@Service
public class UserServiceImp extends BaseServiceImpl<TUser> implements IUserService {

    @Autowired
    private TUserMapper userMapper;
    @Override
    public IBaseDao<TUser> getBaseDao() {
        return userMapper;
    }

    @Override
    public PageInfo<TUser> page(Integer pageIndex, Integer pageSize) {
        PageHelper.startPage(pageIndex,pageSize);
        List<TUser> list = userMapper.list();
        PageInfo<TUser> pageInfo = new PageInfo<TUser>(list,3);
        return pageInfo;
    }
}