package com.s.dto;

import com.s.entity.Spec;

import java.util.List;

public class SpecCondition
{
    private Integer specid;
    private Integer superior;
    private String specname;
    private List<Spec> specs;

    public Integer getSpecid() {
        return specid;
    }

    public void setSpecid(Integer specid) {
        this.specid = specid;
    }

    public Integer getSuperior() {
        return superior;
    }

    public void setSuperior(Integer superior) {
        this.superior = superior;
    }

    public String getSpecname() {
        return specname;
    }

    public void setSpecname(String specname) {
        this.specname = specname;
    }

    public List<Spec> getSpecs() {
        return specs;
    }

    public void setSpecs(List<Spec> specs) {
        this.specs = specs;
    }
}
