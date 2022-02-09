package com.cargodelivery.controllers;


import com.cargodelivery.domain.Tariff;
import com.cargodelivery.dtos.UserSingUpDto;
import com.cargodelivery.services.TariffService;
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
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/tariff")
public class TariffController {

    @Resource
    TariffService tariffService;


    @GetMapping(value = "/all")
    public ModelAndView getAllTariffs() {


        ModelAndView view = new ModelAndView("tariff");
//        List<Tariff> tariffsList = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            tariffsList.add(Tariff.getInstance());
//        }

        view.addObject("tariffs", tariffService.getAll());
        return view;
    }

    //    @GetMapping(value = "/add")
//    public ModelAndView openAddTariffPage(){
//        ModelAndView view = new ModelAndView("add-tariff");
//        Tariff tariff = new Tariff();
//        view.addObject("tariff", tariff );
//        return view;
//    }
    @GetMapping(value = "/add")
    public String openAddTariffPage(Tariff tariff) {
        return "add-tariff";
    }

    @PostMapping(value = "/add")
    public String saveTariff(@Valid @ModelAttribute(value = "tariff") Tariff tariff, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            System.out.println(bindingResult.getAllErrors());
            return "add-tariff";
        }
        tariff.setCreated(LocalDate.now());
        tariffService.saveTariff(tariff);

        return "redirect:/tariff/all";
    }




}
