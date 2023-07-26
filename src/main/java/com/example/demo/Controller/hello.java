package com.example.demo.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Demo class
 *
 * @author nol
 * @date 2022/12/16
 */
@RestController
public class hello {
    @GetMapping("/hello")
    @ResponseBody
    public void hello1(Model model) {
        Map<String, Object> map = model.asMap();
        Set<String> keyset = map.keySet();
        Iterator<String> iterator = keyset.iterator();
        //循环条件：判断iterator是否有数据
        while (iterator.hasNext()) {
            String key = iterator.next();
            Object value = map.get(key);
            System.out.println(key + ">>>" + value);
        }
    }



}
