package com.shopco.authservice.controller;

import com.shopco.authservice.dto.request.changeRoleRequest;
import com.shopco.authservice.services.AuthenticationService;
import com.itgura.dto.AppResponse;
import com.itgura.exception.ValueNotExistException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/v1/auth-service-protected/admin")
@RequiredArgsConstructor
public class AdminController {

    @Autowired
    private final AuthenticationService authenticationService;

    @PostMapping("/testAdmin")
    public ResponseEntity<String> seyHello() {
        return ResponseEntity.ok("Hello from Admin Controller!");
    }

    @PostMapping("/changeRole")
    public AppResponse<String> changeUserRole(@RequestBody changeRoleRequest request) {
        try {
            return AppResponse.ok(authenticationService.changeUserRole(request));

        } catch (ValueNotExistException e) {
            return AppResponse.error(null, "Value not found", "404", "", e.getMessage());

        }

    }


}
