package com.s.homepage.impl;

import com.s.entity.Product_types;
import com.s.homepage.mapper.ProducttypeMapper;
import com.s.interfac.ProducttypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProducttypeServiceImpl implements ProducttypesService {
    @Autowired
    private ProducttypeMapper producttypeMapper;

    @Override
    public List<Product_types> getoneTypes() {
        return producttypeMapper.getoneTypes();
    }

    @Override
    public List<Product_types> gettwoTypes(Integer typeId) {
        return producttypeMapper.gettwoTypes(typeId);
    }
}
