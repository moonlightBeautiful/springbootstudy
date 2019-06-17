package com.java1234.c02propertiesKeyAndVal;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloKVController {

    @Value("${helloWorld}")
    private String helloWorld;

    @Resource
    private MysqlProperties mysqlProperties;

    @RequestMapping("/hello2")
    public String say() {
        return helloWorld;
    }

    @RequestMapping("/showJdbc")
    public String showJdbc() {
        return "mysql.jdbcName:" + mysqlProperties.getJdbcName() + "<br/>"
                + "mysql.dbUrl:" + mysqlProperties.getDbUrl() + "<br/>"
                + "mysql.userName:" + mysqlProperties.getUserName() + "<br/>"
                + "mysql.password:" + mysqlProperties.getPassword() + "<br/>";
    }
}
