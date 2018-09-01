package com.s.service;

import com.s.dao.SpecMapper;
import com.s.entity.Spec;
import com.s.interfac.SpecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecServiceImpl implements SpecService
{
    @Autowired
    private SpecMapper specMapper;

    @Override
    public List<Spec> findSpecTopInfo() {
        return specMapper.findSpecTopInfo();
    }

    @Override
    public List<Spec> findSpecSecondInfo(Integer specId) {
        return specMapper.findSpecSecondInfo(specId);
    }

    @Override
    public Integer findCodeInfo(String code) {
        return specMapper.findCodeInfo(code);
    }

    @Override
    public List<Spec> findSidInfo(Integer sid) {
        return specMapper.findSidInfo(sid);
    }
}
