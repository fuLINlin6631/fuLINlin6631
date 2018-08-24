package com.s.interfac;

import com.s.entity.Advert;

import java.util.List;

public interface AdvertService {
    /**
     * 查询广告位置的图片
     * @param positionsId
     * @return
     */
    List<Advert> getAdverts(Integer positionsId);

}
