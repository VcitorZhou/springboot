package com.yundan.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author ZY
 * @Date 2020/10/14 8:46
 * @Version 1.0
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/say")
    public @ResponseBody
    String say(){
        return "hello say";
    }
}
