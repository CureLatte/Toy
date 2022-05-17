package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data", "hello!");
        return "hello";
    }

    // GetMapping -> method : GET
    // () -> URL 이름
    @GetMapping("hello-mvc")
    //RequestParam(value = "value 이름", required = (true, false))
    // true : value name을 꼭 써야함, false : value name을 사용 x
    public String helloMvc(@RequestParam(value = "name", required = true) String name, Model model){
        model.addAttribute("name", name);
        // template 폴더에 있어야함!
        return "hello-template";
    }

    // API 구현 - 맛보기
    @GetMapping("hello-string")
    // http body에 내용을 직접 넣어주는 어노테이션
    @ResponseBody
    public String helloString(@RequestParam("name") String name){
        return "hello " + name; // input : name -> output : hello name
    }

    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName(name);
        // 객체를 return 하면 JsonMessageConverter가 동작하여 JSON으로 받아 보내준다!
        return hello;
    }

    // Hello 객체 생성
    static class Hello{
        private String name;

        // Java bin 표준 방식 Getter Setter
        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name = name;
        }
    }

    @GetMapping("test")
    public String test(@RequestParam("name") String name){
        return "test";
    }

}
