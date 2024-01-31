package com.kkato.helloworld;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloworldController {
    @GetMapping("/Hello world")
    public HelloworldResponse Hello() {
        return new HelloworldResponse("Hello world");
    }
    @PatchMapping("/Say hello project")
    public HelloworldResponse SayHello(){
        return new HelloworldResponse("Say Hello project");
    }
}
