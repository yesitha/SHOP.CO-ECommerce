package com.shopco.authservice.services;

import com.shopco.authservice.dto.request.AuthenticationRequest;
import com.shopco.authservice.dto.request.RegisterRequest;
import com.shopco.authservice.dto.request.changeRoleRequest;
import com.shopco.authservice.dto.response.AuthenticationResponse;
import com.shopco.authservice.entity.Role;
import com.shopco.authservice.entity.User;
import com.shopco.authservice.repository.UserRepository;
import com.itgura.exception.ApplicationException;
import com.itgura.exception.ValueNotExistException;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    @Value("${jwt.secretKey}")
    private String SECRET_KEY;
    @Autowired
    private RestTemplate restTemplate;

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    @Transactional(rollbackFor = ApplicationException.class)
    public AuthenticationResponse register(RegisterRequest registerRequest) throws IllegalArgumentException, ApplicationException {
        if(isExistingUser(registerRequest.getEmail())){
            throw new IllegalArgumentException("The email is already in use in another account, try logging instead");
        }
        var  user = User.builder()
                .firstName(registerRequest.getFirstName())
                .lastName(registerRequest.getLastName())
                .email(registerRequest.getEmail())
                .password(passwordEncoder.encode(registerRequest.getPassword()))
                .role(Role.USER)
                .build();
        userRepository.save(user);

        var jwtToken = jwtService.generateToken(user);
        var refreshToken = jwtService.generateRefresh(new HashMap<>(),user);

        return AuthenticationResponse.builder()
                .authenticationToken(jwtToken)
                .refreshToken(refreshToken)
                .build();
    }



    private boolean isExistingUser(String email) {
        return  userRepository.existsByEmail(email);

    }

    public AuthenticationResponse authenticate(AuthenticationRequest authenticationRequest) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(authenticationRequest.getEmail(), authenticationRequest.getPassword())
        );
        var user = userRepository.findByEmail(authenticationRequest.getEmail()).orElseThrow(() -> new IllegalArgumentException("Invalid email or password"));
        var jwtToken = jwtService.generateToken(user);
        var refreshToken = jwtService.generateRefresh(new HashMap<>(),user);
        return AuthenticationResponse.builder()
                .authenticationToken(jwtToken)
                .refreshToken(refreshToken)
                .build();
    }

    public AuthenticationResponse refreshToken(String refreshToken) {

        var user = userRepository.findByEmail(jwtService.getEmailFromToken(refreshToken)).orElseThrow(() -> new IllegalArgumentException("Invalid refresh token"));
        var jwtToken = jwtService.generateToken(user);
        var newRefreshToken = jwtService.generateRefresh(new HashMap<>(),user);
        return AuthenticationResponse.builder()
                .authenticationToken(jwtToken)
                .refreshToken(newRefreshToken)
                .build();
    }

    public Boolean validateToken(String token) {
        return jwtService.validateToken(token);
    }



    public String changeUserRole(changeRoleRequest request) throws ValueNotExistException {
        String email = request.getUsername();
        Optional<User> user = userRepository.findByEmail(email);

        if (user.isPresent()) {
            user.get().setRole(Role.valueOf(request.getChangeRole()));
            userRepository.save(user.get());
            return "Role changed successfully";
        }else {
            throw new ValueNotExistException("User: "+email+ " not found");
        }
    }
}
