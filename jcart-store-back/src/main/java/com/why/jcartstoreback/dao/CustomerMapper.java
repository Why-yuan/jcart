package com.why.jcartstoreback.dao;

import com.why.jcartstoreback.po.Customer;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerMapper {
    int deleteByPrimaryKey(Integer customerId);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Integer customerId);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);


    Customer selectByUsername(@Param("username") String username);

    Customer selectByEmail(@Param("email") String email);


}