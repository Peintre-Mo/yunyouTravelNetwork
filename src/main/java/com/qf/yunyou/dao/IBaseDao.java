package com.qf.yunyou.dao;

import java.util.List;

public interface IBaseDao<T> {
    int insert(T t);

    T select(String id,T t);

    List<T> selectList(int page,int size);
}
