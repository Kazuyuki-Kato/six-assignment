package com.kkato.helloworld;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloworldController {
    @GetMapping("/Hello world")
    public String Hello() {
        return "Hello world";
    }

    @DeleteMapping("/Hello world2")
    public String Hello2(){
        return "Hello kato";
    }


}
