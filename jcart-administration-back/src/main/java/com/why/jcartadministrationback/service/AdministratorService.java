package com.why.jcartadministrationback.service;

import com.why.jcartadministrationback.po.Administrator;

public interface AdministratorService {
    Administrator getById(Integer administratorId);

    Administrator getByUsername(String username);

    void update(Administrator administrator);
}
