package com.s.solr.impl;

import com.s.entity.Product;
import com.s.interfac.ProductService;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.params.ModifiableSolrParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private SolrClient solrClient;

    @Override
    public List<Product> search(String productTitl) {
        ModifiableSolrParams solrParams = new ModifiableSolrParams();
        solrParams.add("q" , "productTitle:"+productTitl);//查询条件
        solrParams.add("sort" , "productId asc");
        QueryResponse queryResponse;
        try {
            queryResponse = solrClient.query("shoeproduct" , solrParams);
            SolrDocumentList solrDocumentsList = queryResponse.getResults();
            List<Product> list = new ArrayList<Product>();
            for (SolrDocument solrDocument: solrDocumentsList)
            {
                String productId = solrDocument.get("productId").toString();
                String productName = solrDocument.get("productName").toString();
                String productTitle = solrDocument.get("productTitle").toString();
                String productTapprice = solrDocument.get("productTapprice").toString();
                String productAgio = solrDocument.get("productAgio").toString();
                String productUrl = solrDocument.get("productUrl").toString();
                Product product = new Product();
                product.setProductid(Integer.parseInt(productId));
                product.setProductname(productName);
                product.setProducttitle(productTitle);
                product.setProducttapprice(Integer.parseInt(productTapprice));
                product.setProductagio(Integer.parseInt(productAgio));
                product.setProducturl(productUrl);
                list.add(product);
            }
            return list;
        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
