package com.example.demo_grpc_client.rest;

import com.example.demo_grpc_client.grpc.GrpcClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final GrpcClientService grpcClientService;

    public HelloController(GrpcClientService grpcClientService) {
        this.grpcClientService = grpcClientService;
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(defaultValue = "World") String name) {
        return grpcClientService.sayHello(name);
    }

}
