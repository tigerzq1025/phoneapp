package com.jbit.controller;

import com.jbit.service.IfService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.Resource;

@Controller
public class IfController {

    @Resource
    public IfService ifService;

    @GetMapping("/")
    public String findAllIf(Model model){
        model.addAttribute("informations",ifService.findAllIf());

        return "index";
    }

    @PostMapping("/replies/{id}")
    public String findAllRe(@PathVariable Long id, Model model){
        model.addAttribute("info",ifService.findOneIf(id));

        return "replies";
    }

}
