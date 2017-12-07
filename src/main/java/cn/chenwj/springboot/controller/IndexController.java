package cn.chenwj.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制类
 *
 * @author Chen WeiJie
 * @date 2017-12-07 18:55
 **/
@RestController
public class IndexController {


    @RequestMapping(value = {"/", "/home"})
    public String home() {

        return "Hello World";
    }


}
