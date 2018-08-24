package com.s.homepage.impl;

import com.s.entity.Advert;
import com.s.homepage.mapper.AdvertMapper;
import com.s.interfac.AdvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdvertServiceImpl implements AdvertService{
    @Autowired
    private AdvertMapper advertMapper;
    @Override
    public List<Advert> getAdverts(Integer positionsId) {
        return advertMapper.getAdverts(positionsId);
    }
}
