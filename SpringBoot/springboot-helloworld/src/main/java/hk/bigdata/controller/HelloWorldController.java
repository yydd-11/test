package hk.bigdata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @ResponseBody  //ResponseBody
    @RequestMapping("/hello")  //返回Json格式数据
    public String hello(){
        return "Hello World";
    }

    @ResponseBody  //ResponseBody
    @RequestMapping("/hello1")  //返回Json格式数据
    public String hello1(){
        return "Hello World1";
    }
}
