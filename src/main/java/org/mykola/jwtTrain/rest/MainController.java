package org.mykola.jwtTrain.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path="/", produces = "application/json")
public class MainController {

    @GetMapping("hello")
    public String hello(){
        return "Hi There again and again!";
    }

    // сюда доступ разрешен только user и admin
    @GetMapping("/user")
    public String user() {
        return "User";
    }
    // сюда доступ разрешен только admin
    @GetMapping("/admin")
    public String admin() {
        return "Admin";
    }

}
