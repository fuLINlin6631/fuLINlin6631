package com.s.interfac;

import com.s.entity.Carts;

import java.util.List;

public interface CartService {
    /**
     * 获取用户购物车信息
     * @param userId
     * @return
     */
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
