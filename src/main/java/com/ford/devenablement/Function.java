package com.ford.devenablement;

import com.microsoft.azure.functions.*;
import com.microsoft.azure.functions.annotation.AuthorizationLevel;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.HttpTrigger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.function.context.FunctionScan;
import org.springframework.context.annotation.Bean;

import java.util.Optional;

/**
 * Azure Functions with HTTP Trigger.
 */

@FunctionScan
@SpringBootApplication
public class Function {
    public static void main(String[] args) {
        SpringApplication.run(Function.class, args);
    }

    @FunctionName("HttpTrigger-Java")
    public HttpResponseMessage run(
            @HttpTrigger(name = "req", methods = {HttpMethod.GET, HttpMethod.POST}, authLevel = AuthorizationLevel.ANONYMOUS) HttpRequestMessage<Optional<String>> request,
            final ExecutionContext context) {
        context.getLogger().info("Java HTTP trigger processed a request.");

            return request.createResponseBuilder(HttpStatus.OK).body("BLAH").build();
    }

    @Bean
    public java.util.function.Function<Foo, Bar> reverseString() {
        return foo -> new Bar(foo.reverse());
    }

}
