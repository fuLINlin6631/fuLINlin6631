package com.s.dao;

import com.s.entity.Brands;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BrandsMapper
{
    /**
     * 所有品牌
     * @return
     */
    @Select("SELECT `brandId`,`brandName`,`brandImg`,code FROM `brands` WHERE `dataFlag` = 1")
    List<Brands> findBrandsInfo();

    /**
     *  获取品牌名称
     * @param bid
     * @return
     */
    @Select("SELECT `brandName`,`code` FROM `brands` WHERE `brandId` = #{bid}")
    Brands findBidInfo(Integer bid);
}
