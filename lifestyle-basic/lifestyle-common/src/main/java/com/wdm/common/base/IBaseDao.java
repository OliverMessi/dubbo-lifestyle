package com.wdm.common.base;

import java.util.List;

/**
 * @author wdm
 * @create 2020-07-13 21:58
 **/
public interface IBaseDao<T> {

    int deleteByPrimaryKey(Long id);

    int insert(T t);

    int insertSelective(T t);

    T selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(T t);

    int updateByPrimaryKeyWithBLOBs(T t);

    int updateByPrimaryKey(T t);

    List<T> list();
}