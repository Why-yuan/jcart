package com.why.jcartstoreback.service;


import com.github.pagehelper.Page;
import com.why.jcartstoreback.dto.out.ProductListOutDTO;
import com.why.jcartstoreback.dto.out.ProductShowOutDTO;

public interface ProductService {

    ProductShowOutDTO getById(Integer productId);

    Page<ProductListOutDTO> search(Integer pageNum);

}
