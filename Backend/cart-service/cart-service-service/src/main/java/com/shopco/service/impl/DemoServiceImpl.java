package com.shopco.service.impl;

import com.shopco.repository.DemoRepository;
import com.shopco.response.dto.DemoResponseDto2;
import com.shopco.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.security.auth.login.CredentialNotFoundException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.UUID;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoRepository demoRepository;


    @Override
    public List<DemoResponseDto2> test(UUID id) throws CredentialNotFoundException, URISyntaxException {
        return List.of();
    }
}
