package com.s.interfac;

import com.s.entity.Product_spec;

import java.util.List;

public interface ProductspecService
{
    /**
     *  商品所有色号
     * @param pid   商品id
     * @return
     */
    List<Product_spec> findByPidInfo(Integer pid);
}
