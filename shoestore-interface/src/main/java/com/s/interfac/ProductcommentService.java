package com.s.interfac;

import com.s.entity.Product_comment;

import java.util.List;

public interface ProductcommentService {
    /**
     * 查询商品评论
     * @param productId
     * @return
     */
    List<Product_comment> getComments(Integer productId);

    /**
     * 添加评论
     * @param product_comment
     * @return
     */
    int addComment(Product_comment product_comment);
}
