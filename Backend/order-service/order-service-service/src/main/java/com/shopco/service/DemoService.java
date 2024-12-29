package com.shopco.service;

import com.itgura.exception.ApplicationException;
import com.itgura.exception.BadRequestRuntimeException;
import com.shopco.response.dto.DemoResponseDto;

import javax.security.auth.login.CredentialNotFoundException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.UUID;

public interface DemoService {

    List<DemoResponseDto> test(UUID classId) throws ApplicationException, CredentialNotFoundException, BadRequestRuntimeException, URISyntaxException;

}
