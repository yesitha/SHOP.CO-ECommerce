package com.shopco.authservice.controller;


import com.shopco.authservice.dto.request.AuthenticationRequest;
import com.shopco.authservice.dto.request.RegisterRequest;
import com.shopco.authservice.dto.response.AuthenticationResponse;
import com.shopco.authservice.services.AuthenticationService;
import com.itgura.dto.AppResponse;
import com.itgura.exception.ApplicationException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth-service")
@RequiredArgsConstructor
public class AuthenticationController {
    @Autowired
    private final AuthenticationService authenticationService;

    @PostMapping("/register")
    public AppResponse<AuthenticationResponse> register(@RequestBody RegisterRequest registerRequest){
        try {
            AuthenticationResponse res = authenticationService.register(registerRequest);
            return AppResponse.ok(res);
        }catch(IllegalArgumentException e ){
            return AppResponse.error(null,"Illegal Arguments","500","500",e.getMessage());
        }catch(ApplicationException e){
            return AppResponse.error(null,"Application Exception","500","500",e.getMessage());

        } catch (Exception e) {
            return AppResponse.error(null, "Server Error", "500", "500", e.getMessage());
        }

    }

    @PostMapping("/authenticate")
    public AppResponse<AuthenticationResponse> register(@RequestBody AuthenticationRequest authenticationRequest){
        try {
            AuthenticationResponse res = authenticationService.authenticate(authenticationRequest);
            return AppResponse.ok(res);
        } catch (Exception e) {
            return AppResponse.error(null, "Server Error", "500", "", e.getMessage());

        }

    }

    @PostMapping("/refresh")
    public AppResponse<AuthenticationResponse> refresh(@RequestParam("token") String refreshToken){
        try {
            AuthenticationResponse res = authenticationService.refreshToken(refreshToken);
            return AppResponse.ok(res);
        } catch (Exception e) {
            return AppResponse.error(null, "Server Error", "500", "", e.getMessage());
        }


    }

    @GetMapping("/validateToken")
    public AppResponse<Boolean> validateToken(@RequestParam("token") String token){
        try {
            Boolean res = authenticationService.validateToken(token);
            return AppResponse.ok(res);
        } catch (Exception e) {
            return AppResponse.error(null, "Server Error", "500", "", e.getMessage());
        }
    }




}
