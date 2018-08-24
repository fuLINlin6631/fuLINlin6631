package com.s.cart.mapper;

import com.s.entity.Carts;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CartMapper {
    /**
     * 获取用户购物车信息
     * @param userId
     * @return
     */
    @Select("select * from carts where userId = #{userId}")
    List<Carts> getCarts(Integer userId);

    /**
     * 更新购物车数量
     * @param count
     * @return
     */
    int updateCount(Integer count);

    /**
     * 删除购物车商品
     * @param cartId
     * @return
     */
    int delCart(Integer cartId);

    /**
     * 添加商品到购物车
     * @param carts
     * @return
     */
    int addCart(Carts carts);
}
