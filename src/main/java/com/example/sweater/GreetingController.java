package com.example.sweater;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping("/greetings")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World")
                                       String name, Map<String, Object> model) {
        model.put("name", name);
        return "/startbootstrap-agency-gh-pages/greetings";
    }
    @GetMapping
    public String main(Map<String, Object> model){
        model.put("some", "Hello Misha");
        return "main";
    }



}