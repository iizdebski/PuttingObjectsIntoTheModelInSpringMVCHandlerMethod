package com.izdebski.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ZumwaltController {

    @RequestMapping(value="/")
    public String welcomePage(){
        return "welcomePage";
    }

    @ModelAttribute
    public void modelData(Model model){
        model.addAttribute("welcomeMessage", "Welcome to https://fainemisto.com");
        model.addAttribute("headerMessage", "Ternopil ForEver!");
    }
}
