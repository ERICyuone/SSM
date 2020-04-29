package com.miaoshaproject;

import com.miaoshaproject.dao.UserDOMapper;
import com.miaoshaproject.dataobject.UserDO;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Hello world!
 */
//@EnableAutoConfiguration//app的启动类当成一个自动化配置 自动加载 自动启动一个内嵌tomcat 启动默认配置
@SpringBootApplication(scanBasePackages = {"com.miaoshaproject"})
@RestController// springMVC 实现controller
@MapperScan("com.miaoshaproject.dao")
public class App {
    @Resource
    private UserDOMapper userDOMapper;

    @RequestMapping("/")// 根目录访问
    public String home() {
        UserDO userDO = userDOMapper.selectByPrimaryKey(1);
        if (userDO == null) {
            return "用户对象不存在";
        } else {
            return userDO.getName()+userDO.getRegisitMode();
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        SpringApplication.run(App.class, args);
    }
}
