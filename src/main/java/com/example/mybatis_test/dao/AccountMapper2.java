package com.example.mybatis_test.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

@Service
public interface AccountMapper2 {
    int update(@Param("money") double money, @Param("id") int  id);
}
