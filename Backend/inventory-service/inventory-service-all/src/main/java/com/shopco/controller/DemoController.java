package com.shopco.controller;

import com.shopco.dto.AppResponse;
import com.shopco.response.dto.DemoResponseDto;
import com.shopco.service.DemoService;
import com.shopco.util.OrderServiceURI;
import com.shopco.util.URIPathVariable;
import com.shopco.util.URIPrefix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping(URIPrefix.API + URIPrefix.V1 + URIPathVariable.ORDER_SERVICE)
public class DemoController {
    @Autowired
    private DemoService demoService;

    @GetMapping(OrderServiceURI.DEMO + OrderServiceURI.test + URIPrefix.BY_ID)
    public AppResponse<List<DemoResponseDto>> getAllClasses(@PathVariable UUID id) {

        try {
            List<DemoResponseDto> response = this.demoService.test(id);
            return AppResponse.ok(response);
        } catch (Exception e) {
            e.printStackTrace();
            return AppResponse.error(null, e.getMessage(), "Server Error", "500", "");
        }
    }

}
