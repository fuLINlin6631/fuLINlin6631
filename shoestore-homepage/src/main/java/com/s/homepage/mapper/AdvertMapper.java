package com.s.homepage.mapper;

import com.s.entity.Advert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AdvertMapper {
    /**
     * 查询广告位置的图片
     * @param positionsId
     * @return
     */
    @Select("select advertId,positionsId,advertName,advertUrl,advertImg,createTime from advert where positionsId = #{positionsId}")
    List<Advert> getAdverts(Integer positionsId);
}
