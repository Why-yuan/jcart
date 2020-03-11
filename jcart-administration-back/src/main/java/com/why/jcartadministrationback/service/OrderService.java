package com.why.jcartadministrationback.service;

import com.github.pagehelper.Page;
import com.why.jcartadministrationback.dto.in.OrderSearchInDTO;
import com.why.jcartadministrationback.dto.out.OrderListOutDTO;
import com.why.jcartadministrationback.dto.out.OrderShowOutDTO;
import com.why.jcartadministrationback.po.Order;

public interface OrderService {
    Page<OrderListOutDTO> search(OrderSearchInDTO orderSearchInDTO, Integer pageNum);

    OrderShowOutDTO getById(Long orderId);

    void update(Order order);
}
