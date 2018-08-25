package com.s.dao;

import com.s.entity.Spec;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SpecMapper
{
    /**
     * 商品规格顶级分类集合
     * @return
     */
    @Select("SELECT `specId`,`specName` FROM `spec` where `superior` = 0")
    List<Spec> findSpecTopInfo();

    /**
     *  商品规格二级分类集合
     * @param specId
     * @return
     */
    @Select("SELECT `specId`,`specName` FROM `spec` WHERE `superior` = #{specId}")
    List<Spec> findSpecSecondInfo(Integer specId);
}
