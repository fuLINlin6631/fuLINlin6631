package com.s.dao;

import com.s.entity.Product;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductMapper
{
    /**
     *  商品集合
     * @param sid
     * @param bname
     * @return
     */
    List<Product> findProductByInfo(@Param("sid") Integer[] sid , @Param("bname") String bname);

    /**
     * 根据货号获取商品信息
     * @param productName   货号
     * @return
     */
    @Select("SELECT `productId`,`productTitle`,`productTapprice`,`productAgio`,`productUrl`,`productAlbum` FROM `product` WHERE `productName` = #{productName} AND `productStatus` = 1")
    Product findByPNameInfo(String productName);
}
