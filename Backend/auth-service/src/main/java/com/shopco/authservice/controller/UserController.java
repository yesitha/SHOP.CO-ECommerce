package com.shopco.authservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("api/v1/auth-service-protected/user")
@RequiredArgsConstructor


public class UserController {

        @PostMapping("/testUser")
        public String seyHello() {
            return "Hello from User Controller!";
        }



}
