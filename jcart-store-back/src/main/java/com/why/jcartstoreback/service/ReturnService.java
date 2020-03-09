package com.why.jcartstoreback.service;

import com.github.pagehelper.Page;
import com.why.jcartstoreback.po.Return;

public interface ReturnService {
    Integer create(Return aReturn);

    Page<Return> getPageByCustomerId(Integer customerId, Integer pageNum);

    Return getById(Integer returnId);
}
