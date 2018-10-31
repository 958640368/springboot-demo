package com.first.demo.Controller;

import com.first.demo.Service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private TestService testService;

    @RequestMapping("/helloworld")
    public String helloWorld(@RequestParam("name")String name) {
        return "Hello World";
    }

    @RequestMapping("/getTestCountById")
    public int getTestCountById(int id) {
        logger.info("这是controller！！");
        return testService.getTestCountById(id);
    }
}
