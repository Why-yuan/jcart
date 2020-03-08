package com.why.jcartadministrationback.service;

import com.github.pagehelper.Page;
import com.why.jcartadministrationback.dto.out.OrderListOutDTO;

public interface OrderService {
    Page<OrderListOutDTO> search(Integer pageNum);
}
