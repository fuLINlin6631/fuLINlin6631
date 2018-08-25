package com.s.interfac;

import com.s.entity.Positions;

public interface PositionsService {
    /**
     * 查询广告位置编号
     * @param positionsName
     * @return
     */
    Positions getPositionsId(String positionsName);
}
