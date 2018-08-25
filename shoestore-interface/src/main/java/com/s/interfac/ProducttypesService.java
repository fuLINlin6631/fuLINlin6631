package com.s.interfac;

import com.s.entity.Product_types;

import java.util.List;

public interface ProducttypesService {
    /**
     * 查询一级分类
     * @return
     */
    List<Product_types> getoneTypes();

    /**
     * 查询下级分类
     * @param typeId
     * @return
     */
    List<Product_types> gettwoTypes(Integer typeId);
}
