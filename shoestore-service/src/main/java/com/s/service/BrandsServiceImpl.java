package com.s.service;

import com.s.dao.BrandsMapper;
import com.s.entity.Brands;
import com.s.interfac.BrandsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BrandsServiceImpl implements BrandsService
{
    @Autowired
    private BrandsMapper brandsMapper;

    @Override
    public List<Brands> findBrandsInfo() {
        return brandsMapper.findBrandsInfo();
    }
}
