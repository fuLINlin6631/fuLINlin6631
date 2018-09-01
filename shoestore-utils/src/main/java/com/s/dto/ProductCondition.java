package com.s.dto;

import com.s.entity.Spec;

import java.util.List;

public class ProductCondition
{
    private Integer productid;
    private String productname;
    private String producttitle;
    private Integer producttapprice;
    private Integer productagio;
    private List<Spec> specs;
    private String producturl;
    private String brandname;
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProducttitle() {
        return producttitle;
    }

    public void setProducttitle(String producttitle) {
        this.producttitle = producttitle;
    }

    public Integer getProducttapprice() {
        return producttapprice;
    }

    public void setProducttapprice(Integer producttapprice) {
        this.producttapprice = producttapprice;
    }

    public Integer getProductagio() {
        return productagio;
    }

    public void setProductagio(Integer productagio) {
        this.productagio = productagio;
    }

    public List<Spec> getSpecs() {
        return specs;
    }

    public void setSpecs(List<Spec> specs) {
        this.specs = specs;
    }

    public String getProducturl() {
        return producturl;
    }

    public void setProducturl(String producturl) {
        this.producturl = producturl;
    }
}
