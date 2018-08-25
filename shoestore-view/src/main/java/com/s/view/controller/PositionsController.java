package com.s.view.controller;

import com.alibaba.fastjson.JSON;
import com.s.entity.Advert;
import com.s.entity.Positions;
import com.s.interfac.AdvertService;
import com.s.interfac.PositionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PositionsController {
    @Autowired
    private PositionsService positionsService;
    @Autowired
    private AdvertService advertService;

    @ResponseBody
    @RequestMapping("/scroll_cons.htm")
    public String getScrollcons(String positionName){
        Positions positions = positionsService.getPositionsId(positionName);
        List<Advert> adverts = advertService.getAdverts(positions.getPositionsid());
        String json = JSON.toJSONString(adverts);
        return json;
    }

}
