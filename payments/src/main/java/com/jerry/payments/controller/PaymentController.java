package com.jerry.payments.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : bibek
 * date : 31/05/21
 */

@RestController
@RequestMapping("/payments/")
public class PaymentController {

    @GetMapping("/ping")
    public String ping() {
        return "Payment service is working fine!";
    }
}
