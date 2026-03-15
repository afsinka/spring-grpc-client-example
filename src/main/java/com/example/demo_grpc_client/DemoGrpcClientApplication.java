package com.example.demo_grpc_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.grpc.client.GrpcChannelFactory;
import com.example.demo_grpc_server.grpc.proto.SimpleGrpc;

@SpringBootApplication
public class DemoGrpcClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoGrpcClientApplication.class, args);
	}

	@Bean
	SimpleGrpc.SimpleBlockingStub stub(GrpcChannelFactory channels) {
		return SimpleGrpc.newBlockingStub(channels.createChannel("local"));
	}

}
