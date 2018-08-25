package com.s.homepage.mapper;

import com.s.entity.Product_types;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProducttypeMapper {
    /**
     * 查询一级分类
     * @return
     */
    @Select("select typeId,typeName,superior,createTime,modifyTime from product_types")
    List<Product_types> getoneTypes();

    /**
     * 查询下级分类
     * @param typeId
     * @return
     */
    @Select("select typeId,typeName,superior,createTime,modifyTime from product_types where typeId = #{typeId}")
    List<Product_types> gettwoTypes(Integer typeId);
}
