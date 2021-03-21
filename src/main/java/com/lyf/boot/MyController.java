package com.lyf.boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author l
 * @date 2021-03-21.
 */
@RestController
public class MyController {


    @RequestMapping("/hello")
    public  String sayHello(){
        return  "hello!!!";
    }
}
