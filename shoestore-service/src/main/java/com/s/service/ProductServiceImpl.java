package com.s.service;

import com.s.dao.ProductMapper;
import com.s.entity.Product;
import com.s.interfac.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService
{
    @Autowired
    private ProductMapper productMapper;
    @Override
    public List<Product> search(String productTitle) {
        return null;
    }

    @Override
    public Product findByPNameInfo(String productName) {
        return productMapper.findByPNameInfo(productName);
    }

    @Override
    public List<Product> findProductByInfo(Integer[] sid, String bname) {
        return productMapper.findProductByInfo(sid , bname);
    }
}
