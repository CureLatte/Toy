package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Example_to_wg {

    @GetMapping("/example")
    public String example(){
        return "example_to_wg/example_to_wg";
    }


}