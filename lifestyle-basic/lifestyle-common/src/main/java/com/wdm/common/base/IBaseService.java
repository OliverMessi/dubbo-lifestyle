package com.wdm.common.base;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author wdm
 * @create 2020-07-13 22:01
 **/
public interface IBaseService<T> {

    int deleteByPrimaryKey(Long id);

    int insert(T t);

    int insertSelective(T t);

    T selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(T t);

    int updateByPrimaryKeyWithBLOBs(T t);

    int updateByPrimaryKey(T t);

    public List<T> list();

    public PageInfo<T> page(Integer pageIndex, Integer pageSize);
}