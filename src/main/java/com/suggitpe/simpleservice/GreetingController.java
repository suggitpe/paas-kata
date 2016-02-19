package com.suggitpe.simpleservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "world") String name) {
        return new Greeting( counter.incrementAndGet(), String.format("Hello, %s !", name));
    }
}
