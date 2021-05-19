package com.iacker.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author iacker
 * @Description
 * @date 2021/5/8 15:38
 */
@RestController
public class TestController {

    @GetMapping("/app/test")
    public String test(){
        return "just a test ....";
    }

}
