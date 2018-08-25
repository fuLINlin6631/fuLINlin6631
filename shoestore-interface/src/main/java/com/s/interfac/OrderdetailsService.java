package com.s.interfac;

import com.s.entity.Order_details;

import java.util.List;

public interface OrderdetailsService {
    /**
     * 查询订单明细
     * @param orderId
     * @return
     */
    List<Order_details> getorderdetails(Integer orderId);

    /**
     * 添加订单明细
     * @param order_details
     * @return
     */
    int addorderdetails(Order_details order_details);



}
