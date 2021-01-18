/**
 * 
 */
package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 黄永琦
 * @since 2021-01-11
 * @see  
 */
@RestController
@RequestMapping("/hello")
public class HelloWorld {
    
    @GetMapping("/world")
    public String hello() {
        return "hello World";
    }

}
