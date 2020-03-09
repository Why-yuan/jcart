package com.why.jcartadministrationback.service;

import com.github.pagehelper.Page;
import com.why.jcartadministrationback.po.Return;

public interface ReturnService {
    Page<Return> search(Integer pageNum);
}
