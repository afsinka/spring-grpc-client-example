package com.example.demo_grpc_client.grpc;

import com.example.demo_grpc_server.grpc.proto.HelloRequest;
import com.example.demo_grpc_server.grpc.proto.SimpleGrpc;
import org.springframework.stereotype.Service;

@Service
public class GrpcClientService {
    private final SimpleGrpc.SimpleBlockingStub stub;

    public GrpcClientService(SimpleGrpc.SimpleBlockingStub stub) {
        this.stub = stub;
    }

    public String sayHello(String name) {
        HelloRequest request = HelloRequest.newBuilder().setName(name).build();
        return stub.sayHello(request).getMessage();
    }
}
