package com.shopco.paymentservice.service.impl;

import com.shopco.paymentservice.repository.TransactionRepository;
import com.shopco.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private TransactionRepository transactionRepository;


    @Override
    public String demoService() {
        return "Hello from payment service";
    }
}
