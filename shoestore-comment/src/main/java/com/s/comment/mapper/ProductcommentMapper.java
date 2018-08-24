package com.s.comment.mapper;

import com.s.entity.Product_comment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductcommentMapper {
    /**
     * 查询商品评论
     * @param productId
     * @return
     */
    @Select("select commentId,productId,userId,commentContent,commentScore,supportCount,createTime,modifyTime from product_comment where productId = #{productId}")
    List<Product_comment> getComments(Integer productId);

    /**
     * 添加评论
     * @param product_comment
     * @return
     */
    @Insert("insert into product_comment" +
            "(productId,userId,commentContent,commentScore,supportCount,createTime,modifyTime) values" +
            "(#{productId},#{userId},#{commentContent},#{commentScore},#{supportCount},#{createTime},#{modifyTime})")
    int addComment(Product_comment product_comment);
}
