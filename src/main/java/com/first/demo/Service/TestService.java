package com.first.demo.Service;

import com.first.demo.Mapper.TestMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Service;



@Service
public class TestService {

    Logger logger = LoggerFactory.getLogger(TestService.class);

    @Autowired
    private TestMapper testMapper;

    public int getTestCountById(int id) {
        logger.info("这是service");
        return testMapper.getTestCountById(id);
    }
}
