package com.why.jcartadministrationback.service;

import com.github.pagehelper.Page;
import com.why.jcartadministrationback.dto.in.ProductCreateInDTO;
import com.why.jcartadministrationback.dto.in.ProductSearchInDTO;
import com.why.jcartadministrationback.dto.in.ProductUpdateInDTO;
import com.why.jcartadministrationback.dto.out.ProductListOutDTO;
import com.why.jcartadministrationback.dto.out.ProductShowOutDTO;

import java.util.List;

public interface ProductService {

    Integer create(ProductCreateInDTO productCreateInDTO);

    void update(ProductUpdateInDTO productUpdateInDTO);

    void delete(Integer productId);

    void batchDelete(List<Integer> productIds);

    Page<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO, Integer pageNum);

    ProductShowOutDTO getById(Integer productId);

}
