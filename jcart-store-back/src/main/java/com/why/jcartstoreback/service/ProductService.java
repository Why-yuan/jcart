package com.why.jcartstoreback.service;


import com.github.pagehelper.Page;
import com.why.jcartstoreback.dto.out.ProductListOutDTO;
import com.why.jcartstoreback.dto.out.ProductShowOutDTO;
import com.why.jcartstoreback.po.Product;

public interface ProductService {

    Product getById(Integer productId);

    ProductShowOutDTO getShowById(Integer productId);

    Page<ProductListOutDTO> search(Integer pageNum);

}
