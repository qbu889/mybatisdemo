package com.example.demo.config;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;
import java.util.Map;

/**
 * Demo class
 *
 * @author nol
 * @date 2022/12/14
 * 在全局配直中添加userlnfo方法，返回一个map.
 * 该方法有一个注解＠ModelAt位ibute，
 * 其中的value£性表示这条返回数据的key，
 * 而方法的返回值是返回数据的value.•
 * 此时在任意请求的Controller中，通过方法参数中的Model都可以获取info的数
 */
@ControllerAdvice
public class GlobalConfig {
    @ModelAttribute(value = "info")
    public Map<String, String > userInfo(){
        HashMap<String, String> map = new HashMap<>(16);
        map.put("username","罗贯中");
        map.put("gender","男");
        return map;
    }
    @InitBinder("b")
    public void init(WebDataBinder binder) {
        binder.setFieldDefaultPrefix("b.");
    }

    @InitBinder("a")
    public void init2(WebDataBinder binder) {
        binder.setFieldDefaultPrefix("a.");
    }


}
