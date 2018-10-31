package com.first.demo.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Mapper
public interface TestMapper {

    int getTestCountById(int id);
}
