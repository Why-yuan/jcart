package com.why.jcartstoreback.service;

import com.github.pagehelper.Page;
import com.why.jcartstoreback.dto.in.OrderCheckoutInDTO;
import com.why.jcartstoreback.dto.out.OrderShowOutDTO;
import com.why.jcartstoreback.po.Order;

public interface OrderService {
    Long checkout(OrderCheckoutInDTO orderCheckoutInDTO,
                  Integer customerId);

    Page<Order> getByCustomerId(Integer pageNum, Integer customerId);

    OrderShowOutDTO getById(Long orderId);
}
