package com.rest.api.rest;

//tell the api this is controller

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    //create a mapping  can get or post request and endpoint name

//    @RequestMapping(method = RequestMethod.GET, path = "/")
    @GetMapping(path = "/hello")
    public String helloWorld(){
        return "Hello World";
    }

    //create a method

    @GetMapping(path = "/hello-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }
}
