package com.shopco.paymentservice.controller;

import com.shopco.paymentservice.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/api/v1/payment-service")
@RequiredArgsConstructor
public class PaymentController {
    @Autowired
    private final PaymentService paymentService;

    @GetMapping("/demoController")
    public String demoController() {
        String response = paymentService.demoService();
        return response;
    }

}
