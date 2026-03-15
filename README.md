Based on: https://docs.spring.io/spring-grpc/reference/getting-started.html

This gRPC client is sending a request to the gRPC server and
the server address is configured in application.properties file.

For demo purposes, to be able to send a request to the gRPC server
via this gRPC client, you can call the REST API below which is implemented
in this project. When you call the REST API, it will send a request
to the gRPC server and then gRPC server will return the result
to REST API and then REST API will return the result to client.

```
curl -X GET "http://localhost:8080/hello?name=Jason"
```

gRPC server example: https://github.com/afsinka/spring-grpc-server-example
