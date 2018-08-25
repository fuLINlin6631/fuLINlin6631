package com.s.order.impl;

import com.s.entity.Orders;
import com.s.interfac.OrdersService;
import com.s.order.mapper.OrdersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService{

    @Autowired
    private OrdersMapper ordersMapper;

//    @Scheduled(cron = "*/5 * * * * ?")
//    public void Timedtask(){
//        System.out.println("--------------");
//    }

    @Override
    public List<Orders> getorders(Integer userId) {
        return ordersMapper.getorders(userId);
    }

    @Override
    public Orders getorder(String orderNo) {
        return ordersMapper.getorder(orderNo);
    }

    @Override
    public int addorder(Orders orders) {
        return ordersMapper.addorder(orders);
    }

    @Override
    public int updateorderStatus(Integer orderId) {
        return ordersMapper.updateorderStatus(orderId);
    }
}
