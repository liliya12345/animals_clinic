package com.animals.clinic.animals.controllers;

import com.animals.clinic.animals.models.User;
import com.animals.clinic.animals.services.impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor


public class UserController {
    private final UserServiceImpl userService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/registration")
    public String registration() {
        return "registration";
    }

    //    @PostMapping("/registration")
//    public String create(@RequestParam(name = "name") String name, @RequestParam(name = "email") String email,
//                         @RequestParam(name = "password") String password, @RequestParam(name = "address") String address,
//                         @RequestParam(name = "phone") String phone) {
//        return null;
//    }
    @PostMapping("/registration")
    public String create(User user) {
        if (userService.createUser(user)) {
            return "redirect:/";
        } else return "/registration";
    }
}
