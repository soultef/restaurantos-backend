package com.companydomain.restaurantmanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaurantManagementController {

    //this is the test of controller
    @GetMapping("/greet")
    public String greeting()
    {
        return "Hello World!";
    }
}
