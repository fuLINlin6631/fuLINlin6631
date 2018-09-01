package com.s.service;

import com.s.dao.ProductspecMapper;
import com.s.entity.Product_spec;
import com.s.interfac.ProductspecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductspecServiceImpl implements ProductspecService
{
    @Autowired
    private ProductspecMapper productspecMapper;
    @Override
    public List<Product_spec> findByPidInfo(Integer pid) {
        return productspecMapper.findByPidInfo(pid);
    }
}
