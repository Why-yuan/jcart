package com.why.jcartadministrationback.service;

import com.github.pagehelper.Page;
import com.why.jcartadministrationback.dto.in.CustomerSetStatusInDTO;
import com.why.jcartadministrationback.po.Customer;

public interface CustomerService {
    Page<Customer> search(Integer pageNum);

    Customer getById(Integer customerId);

    void setStatus(CustomerSetStatusInDTO customerSetStatusInDTO);
}
