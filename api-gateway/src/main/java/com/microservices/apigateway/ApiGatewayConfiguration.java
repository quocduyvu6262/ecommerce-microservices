package com.microservices.apigateway;

import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.Buildable;
import org.springframework.cloud.gateway.route.builder.PredicateSpec;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class ApiGatewayConfiguration {
    @Bean
    public RouteLocator gatewayRouter(RouteLocatorBuilder builder){
        Function<PredicateSpec, Buildable<Route>> routeFunction
                = p -> p.path("/get")
                .filters(f -> f
                        .addRequestHeader("MyHeader", "MyURI")
                        .addRequestParameter("Param", "MyValue"))
                .uri("http://httpbin.org:80");
        return builder.routes()
                .route(routeFunction)
                .route(p -> p.path("/currency-exchange/**")
                        .uri("lb://currency-exchange"))
                .route(p -> p.path("/currency-conversion/**")
                        .uri("lb://currency-conversion-service"))
                .route(p -> p.path("/currency-conversion-feign/**")
                        .uri("lb://currency-conversion-service"))
//                .route(p -> p.path("/api/product")
//                        .uri("lb://product-service"))
//                .route(p -> p.path("/api/products")
//                        .uri("lb://product-service"))
//                .route(p -> p.path("/api/order")
//                        .uri("lb://order-service"))
//                .route(p -> p.path("/api/inventory")
//                        .uri("lb://inventory-service"))
//                .route(p -> p.path("/*")
//                        .uri("http://localhost:8761"))
                .build();
    }
}
