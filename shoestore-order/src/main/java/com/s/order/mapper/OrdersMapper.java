package com.s.order.mapper;

import com.s.entity.Orders;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrdersMapper {
    /**
     * 查询用户订单
     * @param userId
     * @return
     */
    @Select("select orderNo,orderStatus,ordeRealtotalprice,userName from orders where userId = #{userId}")
    List<Orders> getorders(Integer userId);

    /**
     * 根据订单编号获取订单信息
     * @param orderNo
     * @return
     */
    Orders getorder(String orderNo);

    /**
     * 添加用户订单
     * @param orders
     * @return
     */
    int addorder(Orders orders);

    /**
     * 更新订单状态
     * @param orderId
     * @return
     */
    int updateorderStatus(Integer orderId);
}
