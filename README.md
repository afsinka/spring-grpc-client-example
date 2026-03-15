Based on: https://docs.spring.io/spring-grpc/reference/getting-started.html

```
curl -X GET "http://localhost:8080/hello?name=Jason"
```

When you call the Rest API above, it will send a request
to the gRPC server and then gRPC server will return the result
to Rest API and then Rest API will return the result to client.

For gRPC server: https://github.com/afsinka/spring-grpc-server-example
