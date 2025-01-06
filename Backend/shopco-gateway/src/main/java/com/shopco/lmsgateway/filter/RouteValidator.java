package com.shopco.lmsgateway.filter;



import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Predicate;

@Component
public class RouteValidator {

    public static final List<String> openApiEndpoints = List.of(
            "/auth-service/authenticate",
            "/auth-service/register",
            "/auth-service/refresh",
            "/auth-service/validateToken",
            "/auth-service/changeUserRole",
            "/eureka"


    );

    public Predicate<ServerHttpRequest> isSecured = request -> openApiEndpoints.stream()
            .noneMatch(uri -> request.getURI().getPath().contains(uri));
}
