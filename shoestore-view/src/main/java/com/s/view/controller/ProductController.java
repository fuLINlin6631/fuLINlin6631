package com.s.view.controller;

import com.s.dto.ProductCondition;
import com.s.entity.Brands;
import com.s.entity.Product;
import com.s.entity.Product_spec;
import com.s.entity.Spec;
import com.s.interfac.BrandsService;
import com.s.interfac.ProductService;
import com.s.interfac.ProductspecService;
import com.s.interfac.SpecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private ProductspecService productspecService;
    @Autowired
    private SpecService specService;
    @Autowired
    private BrandsService brandsService;

    @RequestMapping("/search")
    public String search(String kw, Model model){
        List<Product> list = productService.search(kw);
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("/findByPNameInfo")
    public String findByPNameInfo(String productName ,String bname ,  Model model){
        List<ProductCondition> productConditions = new ArrayList<ProductCondition>();
        String [] pname = productName.split("-");
        Integer [] sid= new Integer[pname.length];
        for(int i = 0 ; i<pname.length ; i++){
           sid[i] = specService.findCodeInfo(pname[i]);
        }
        List<Product> products = productService.findProductByInfo(sid , bname);
        List<Spec> specs = null;
        for(Product p:products){
            ProductCondition productCondition = new ProductCondition();
            String[] im = p.getProducturl().split(",");
            Brands brands = brandsService.findBidInfo(p.getBrandid());
            specs = specService.findSidInfo(p.getProductid());
            productCondition.setProductid(p.getProductid());
            productCondition.setProductagio((int) (p.getProducttapprice()*p.getProductagio()*0.1));
            productCondition.setProductname(p.getProductname());
            productCondition.setProducttapprice(p.getProducttapprice());
            productCondition.setProducttitle(p.getProducttitle());
            productCondition.setProducturl(im[0]);
            productCondition.setBrandname(brands.getBrandname());
            productCondition.setCode(brands.getCode());
            productCondition.setSpecs(specs);
            productConditions.add(productCondition);
        }

        model.addAttribute("pc" , productConditions);
       return "list";
    }
}
