package com.s.comment.impl;

import com.s.comment.mapper.ProductcommentMapper;
import com.s.entity.Product_comment;
import com.s.interfac.ProductcommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductcommentServiceImpl implements ProductcommentService {
    @Autowired
    private ProductcommentMapper productcommentMapper;

    @Override
    public List<Product_comment> getComments(Integer productId) {
        return productcommentMapper.getComments(productId);
    }

    @Override
    public int addComment(Product_comment product_comment) {
        return productcommentMapper.addComment(product_comment);
    }
}
