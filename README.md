Based on: https://docs.spring.io/spring-grpc/reference/getting-started.html

```
curl -X GET "http://localhost:8080/hello?name=Jason"
```

Rest will call RestController in demo-grpc-client, and then RestController will call gRPC server in demo-grpc-server,
and then gRPC server will return the result to RestController, and then RestController will return the result to Rest
client.