package com.s.cart.impl;

import com.s.cart.mapper.CartMapper;
import com.s.entity.Carts;
import com.s.interfac.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartMapper cartMapper;
    @Override
    public List<Carts> getCarts(Integer userId) {
        return cartMapper.getCarts(userId);
    }

    @Override
    public int updateCount(Integer cartId,Integer count) {
        return cartMapper.updateCount(cartId,count);
    }

    @Override
    public int delCart(Integer cartId) {
        return cartMapper.delCart(cartId);
    }

    @Override
    public int addCart(Carts carts) {
        return cartMapper.addCart(carts);
    }
}
