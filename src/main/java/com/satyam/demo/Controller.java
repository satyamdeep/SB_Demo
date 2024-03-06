package com.satyam.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {

    @GetMapping("/get")
    public String doGet() {
        return "Hello World Get Method";
    }

    @PostMapping("/post")
    public String doPost() {
        return "Hello World Post Method";
    }

    @PutMapping("/put")
    public String doPut() {
        return "Hello World Put Method";
    }

    @DeleteMapping("/delete")
    public String doDelete() {
        return "Hello World Delete Method";
    }


    @GetMapping("/all")
    public String doall() {
        return "Hello World All Page";
    }
}
