package org.example.controller;


import lombok.extern.slf4j.Slf4j;
import org.example.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class DemoController {
    private final DemoService demoService;

    @Autowired
    public DemoController(DemoService demoService){
        this.demoService=demoService;
    }

    @ResponseBody
    @GetMapping("/hello")
    public String hello(){
        return "Hello Welcome";
    }

    @GetMapping("welcome")
    public String welcome(@RequestParam String user,@RequestParam int age, Model model){
//        model.addAttribute("user","vamsi");
        model.addAttribute("user",demoService.getHelloMessage(user));
        model.addAttribute("age",age);
        log.info("model = {}",model);
        return "first";
    }
    @ModelAttribute("welcomeMessage")
    public String welcomeMethod(){
        log.info("Welcome message() called");
//        return "Welcome to this demo application";
        return demoService.getWelcomeMessage();
    }


}
