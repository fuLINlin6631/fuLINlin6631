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

}
