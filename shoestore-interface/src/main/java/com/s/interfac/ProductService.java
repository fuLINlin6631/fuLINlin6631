package com.s.interfac;

import com.s.entity.Product;

import java.util.List;

public interface ProductService {

    /**
     * solr搜索商品
     * @param productTitle
     * @return
     */
    List<Product> search(String productTitle);

    /**
     * 根据货号获取商品信息
     * @param productName   货号
     * @return
     */
    Product findByPNameInfo(String productName);

    /**
     *  商品集合
     * @param sid
     * @param bname
     * @return
     */
    List<Product> findProductByInfo(Integer[] sid , String bname);
}
