package edu.miu.cs.cs499.labnine.eregistrar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PublicViewController {
    @GetMapping(value = {"/", "/eregistrar", "/eregistrar/home"})
    public String displayHome(){
        return "public/home/index";
    }
    @GetMapping(value = "/public/about")
    public String displayAboutPage(){
        return "public/about/about";
    }
}
