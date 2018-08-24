package com.s.homepage.impl;

import com.s.entity.Positions;
import com.s.homepage.mapper.PositionsMapper;
import com.s.interfac.PositionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PositionsServiceImpl implements PositionsService {
    @Autowired
    private PositionsMapper positionsMapper;
    @Override
    public Positions getPositionsId(String positionsName) {
        return positionsMapper.getPositionsId(positionsName);
    }
}
