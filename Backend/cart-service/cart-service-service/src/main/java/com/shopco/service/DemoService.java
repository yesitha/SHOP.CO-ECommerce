package com.shopco.service;

import com.shopco.exception.ApplicationException;
import com.shopco.exception.BadRequestRuntimeException;
import com.shopco.response.dto.DemoResponseDto2;

import javax.security.auth.login.CredentialNotFoundException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.UUID;

public interface DemoService {

    List<DemoResponseDto2> test(UUID classId) throws ApplicationException, CredentialNotFoundException, BadRequestRuntimeException, URISyntaxException;

}
