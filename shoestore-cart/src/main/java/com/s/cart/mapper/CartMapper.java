package com.s.cart.mapper;

import com.s.entity.Carts;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface CartMapper {
    /**
     * 获取用户购物车信息
     * @param userId
     * @return
     */
    @Select("select cartId,userId,productId,productCount from carts where userId = #{userId}")
    List<Carts> getCarts(@Param("userId") Integer userId);

    /**
     * 更新购物车数量
     * @param cartId
     * @param count
     * @return
     */
    @Update("update carts set productCount = #{count} where cartId = #{cartId}")
    int updateCount(@Param("cartId") Integer cartId,@Param("count") Integer count);

    /**
     * 删除购物车商品
     * @param cartId
     * @return
     */
    @Delete("delete from carts where cartId = #{cartId}")
    int delCart(Integer cartId);

    /**
     * 添加商品到购物车
     * @param carts
     * @return
     */
    @Insert("insert into carts(userId,productId,productCount) values(#{userId},#{productId},#{productCount})")
    int addCart(Carts carts);
}
