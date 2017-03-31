package com.gongfu.base;


import java.util.List;
import java.util.Optional;

/**
 * Created by feng on 2017/1/23.
 */
public interface BaseService<T> {

    Optional<T> findById(Long id);

    Integer findCount();

    Optional<T> findOne(T t);

    List<T> findAll();

    List<T> findAll(T t);

    Integer save(T t);

    Integer updateById(T t);

    Integer deleteByIdStr(String ids) throws Exception;

    Integer deleteById(Long id);

    Integer deleteByIds(List<Long> ids);

}
