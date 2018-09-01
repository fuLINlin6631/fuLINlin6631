package com.s.interfac;

import com.s.entity.Brands;

import java.util.List;

public interface BrandsService
{
    /**
     * 所有品牌
     * @return
     */
    List<Brands> findBrandsInfo();

    /**
     *  获取品牌名称
     * @param bid
     * @return
     */
    Brands findBidInfo(Integer bid);
}
