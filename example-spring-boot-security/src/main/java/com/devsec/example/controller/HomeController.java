package com.devsec.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

    @Secured({"ROLE_USER","ROLE_ADMIN"})
    @GetMapping("/")
    public String getHomePage() {
        LOGGER.debug("Getting home page");
        return "home";
    }

}
