package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // localhost:8090으로들어오면 이화면이 호출이 되도록함
    @GetMapping("/")
    public String home() {
        return "home";
    }


}
