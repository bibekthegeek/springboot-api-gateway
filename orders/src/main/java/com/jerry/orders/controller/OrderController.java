package com.jerry.orders.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : bibek
 * date : 31/05/21
 */

@RestController
@RequestMapping("/orders/")
public class OrderController {

    @GetMapping("/ping")
    public String ping() {
        return "Order service is working fine!";
    }
}
