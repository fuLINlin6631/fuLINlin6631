package com.s.view.controller;

import com.s.entity.Product;
import com.s.interfac.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("/search")
    public String search(String kw, Model model){
        List<Product> list = productService.search(kw);
        model.addAttribute("list",list);
        return "list";
    }

}
