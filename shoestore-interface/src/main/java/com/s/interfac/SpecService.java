package com.s.interfac;

import com.s.entity.Spec;

import java.util.List;

public interface SpecService
{
    /**
     * 商品规格顶级分类集合
     * @return
     */
    List<Spec> findSpecTopInfo();

    /**
     *  商品规格二级分类集合
     * @param specId
     * @return
     */
    List<Spec> findSpecSecondInfo(Integer specId);
}
