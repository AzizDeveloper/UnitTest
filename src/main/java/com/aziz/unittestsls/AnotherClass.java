package com.aziz.unittestsls;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AnotherClass {

    @GetMapping
    @ResponseBody
    public String getSomething() {
        return "Hello what's up!";
    }

}
