package com.s.homepage.mapper;

import com.s.entity.Positions;
import org.apache.ibatis.annotations.Select;

public interface PositionsMapper {
    /**
     * 查询广告位置编号
     * @param positionsName
     * @return
     */
    @Select("select positionsId,positionsName,positionWidth,positionHeight from positions where positionsName = #{positionsName}")
    Positions getPositionsId(String positionsName);
}
