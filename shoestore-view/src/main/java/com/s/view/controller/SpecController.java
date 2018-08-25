package com.s.view.controller;

import com.s.dto.SpecCondition;
import com.s.entity.Spec;
import com.s.interfac.SpecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SpecController
{
    @Autowired
    private SpecService specService;

    @ResponseBody
    @RequestMapping("/findSpecTopInfo")
    public List<SpecCondition> findSpecTopInfo()
    {
        List<Spec> specs = specService.findSpecTopInfo();
        List<SpecCondition> specConditions = new ArrayList<SpecCondition>();
        for(Spec s:specs){
            SpecCondition specCondition = new SpecCondition();
            specCondition.setSpecid(s.getSpecid());
            specCondition.setSpecname(s.getSpecname());
            specCondition.setSuperior(s.getSuperior());
            specCondition.setSpecs(specService.findSpecSecondInfo(s.getSpecid()));
            specConditions.add(specCondition);
        }
        for(SpecCondition s: specConditions){
            System.out.println("id"+s.getSpecname());
        }
        return specConditions;
    }

    @ResponseBody
    @RequestMapping("/findSpecSecondInfo")
    public List<Spec> findSpecSecondInfo(){
        return specService.findSpecSecondInfo(1);
    }

}
