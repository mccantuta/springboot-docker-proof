package com.mccl.springbootdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ping")
public class PingController {

    @GetMapping
    public String ping() throws Exception {
        return "Pong";
    }

    @GetMapping(value = "/delay/{delay}")
    public String ping(@PathVariable long delay) throws Exception {
        Thread.sleep(delay);
        return "Pong with delay";
    }
}
