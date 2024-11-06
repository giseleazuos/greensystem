package com.greensystem.greensystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerPrincipal {

        @GetMapping({"/index", "/home", "/"})
        public String index() {
            return "home";
        }
}
