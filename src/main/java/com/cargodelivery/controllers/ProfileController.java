package com.cargodelivery.controllers;

import com.cargodelivery.domain.Tariff;
import com.cargodelivery.dtos.UserSingUpDto;
import com.cargodelivery.services.ProfileService;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.time.LocalDate;

@Controller
@RequestMapping(value = "/profile")

public class ProfileController {
    @Resource
    ProfileService profileService;





}
