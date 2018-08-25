package com.s.view.controller;

import com.s.entity.Brands;
import com.s.interfac.BrandsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BrandsController
{
    @Autowired
    private BrandsService brandsService;

    @ResponseBody
    @RequestMapping("/findBrandsInfo")
    public List<Brands> findBrandsInfo(){ return brandsService.findBrandsInfo(); }
}
