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
    @Select("SELECT `specId`,`specName` FROM `spec` where `superior` = 0 AND `specId` != 5")
    List<Spec> findSpecTopInfo();

    /**
     *  商品规格二级分类集合
     * @param specId
     * @return
     */
    @Select("SELECT `specId`,`specName` FROM `spec` WHERE `superior` = #{specId}")
    List<Spec> findSpecSecondInfo(Integer specId);

    /**
     *  根据code查询分类编号
     * @param code
     * @return
     */
    @Select("SELECT `specId` FROM `spec` WHERE `code` = #{code}")
    Integer findCodeInfo(String code);

    /**
     *  获取分类名称
     * @param sid
     * @return
     */
    @Select("SELECT `specName` FROM `spec` WHERE `specId` IN (SELECT `specId` FROM `product_spec` WHERE `productId` = #{sid}) AND `superior` = 8")
    List<Spec> findSidInfo(Integer sid);
}
