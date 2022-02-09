package com.cargodelivery.controllers;

import com.cargodelivery.domain.LoginData;
import com.cargodelivery.dtos.UserSingUpDto;
import com.cargodelivery.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.validation.Valid;

@Controller

public class UserController {
    @Resource
    UserService userService;

    @GetMapping(value = "/users/all")
    public ModelAndView getAllUsers() {
        ModelAndView view = new ModelAndView("users");
        view.addObject("users", userService.getAll());
        return view;
    }

    @GetMapping(value = "/registration")
    public String openSingUpPage(@ModelAttribute(value = "user") UserSingUpDto user) {
        return "registration";
    }

    @GetMapping(value = "/login")
    public String openLogin(@ModelAttribute(value = "ldata")LoginData ldata) {
        return "login";
    }


    @PostMapping(value = "/registration")
    public String saveUser(@Valid @ModelAttribute(value = "user") UserSingUpDto user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println(bindingResult.getAllErrors());
            return "registration";
        }

        System.out.println(user);

        //todo add validation for income data!!
        //userService.

        return "/";
    }
    @PostMapping(value = "/login")
    public String authUser (@ModelAttribute(value = "ldata")LoginData ldata){
        System.out.println(ldata);

    return "/";
    }

}
