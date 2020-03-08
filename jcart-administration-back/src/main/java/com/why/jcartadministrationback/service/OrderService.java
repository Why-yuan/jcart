package com.why.jcartadministrationback.service;

import com.github.pagehelper.Page;
import com.why.jcartadministrationback.dto.out.OrderListOutDTO;
import com.why.jcartadministrationback.dto.out.OrderShowOutDTO;
import com.why.jcartadministrationback.po.Order;

public interface OrderService {
    Page<OrderListOutDTO> search(Integer pageNum);

    OrderShowOutDTO getById(Long orderId);

    void update(Order order);
}
