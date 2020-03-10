package com.why.jcartadministrationback.service;

import com.github.pagehelper.Page;
import com.why.jcartadministrationback.dto.in.ReturnSearchInDTO;
import com.why.jcartadministrationback.po.Return;

public interface ReturnService {
    Page<Return> search(ReturnSearchInDTO returnSearchInDTO, Integer pageNum);

    Return getById(Integer returnId);

    void update(Return aReturn);
}
