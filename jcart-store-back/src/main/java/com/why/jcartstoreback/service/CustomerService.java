package com.why.jcartstoreback.service;

import com.why.jcartstoreback.dto.in.CustomerRegisterInDTO;
import com.why.jcartstoreback.po.Customer;

public interface CustomerService {

    Integer register(CustomerRegisterInDTO customerRegisterInDTO);

    Customer getByUsername(String username);

    Customer getById(Integer customerId);

    Customer getByEmail(String email);

    void update(Customer customer);

}
