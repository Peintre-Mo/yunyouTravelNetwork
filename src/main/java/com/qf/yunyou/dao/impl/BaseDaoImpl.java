package com.qf.yunyou.dao.impl;

import com.qf.yunyou.dao.IBaseDao;
import com.qf.yunyou.utils.AnnotationUtils;

import java.lang.reflect.Field;
import java.util.List;

public class BaseDaoImpl<T> implements IBaseDao<T> {
    @Override
    public int insert(T t) {
        return 0;
    }

    @Override
    public T select(String id, T t) {
        Class<?> tClass = t.getClass();
        StringBuffer sql = new StringBuffer("select ");
        Field[] files = tClass.getDeclaredFields();
        for (Field field : files) {
            String name = null;
            AnnotationUtils annotation = field.getAnnotation(AnnotationUtils.class);
            if (annotation != null && !annotation.value().equals("")){
                name = annotation.value();
            }else {
                name = field.getName();
            }
            sql.append(name).append(",");
        }
        sql.deleteCharAt(sql.length() - 1);
        return null;
    }

    @Override
    public List<T> selectList(int page, int size) {
        return null;
    }
}
