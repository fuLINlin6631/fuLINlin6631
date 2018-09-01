package com.s.dao;

import com.s.entity.Product_spec;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductspecMapper
{

    /**
     *  商品所有色号
     * @param pid   商品id
     * @return
     */
    @Select("SELECT `pspecId` FROM `product_spec` WHERE `productId` = #{pid} AND `specId` IN (SELECT `specId` FROM `spec` WHERE `superior` = (SELECT `specId` FROM `spec` WHERE `specName` = '颜色'))")
    List<Product_spec> findByPidInfo(Integer pid);
}
