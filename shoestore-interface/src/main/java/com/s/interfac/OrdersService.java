package com.s.interfac;

import com.s.entity.Orders;

import java.util.List;

public interface OrdersService {
    /**
     * 查询用户订单
     * @param userId
     * @return
     */
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
