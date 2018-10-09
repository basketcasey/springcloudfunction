package com.ford.devenablement;


import com.microsoft.azure.functions.HttpMethod;
import com.microsoft.azure.functions.annotation.AuthorizationLevel;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.HttpTrigger;
import com.microsoft.azure.functions.ExecutionContext;
import org.springframework.cloud.function.adapter.azure.AzureSpringBootRequestHandler;
import org.springframework.stereotype.Service;

public class MyHandler extends AzureSpringBootRequestHandler<Foo, Bar> {
    @FunctionName("reverseString")
    public Bar execute(
            @HttpTrigger(
                    name = "req",
                    methods = { HttpMethod.POST, HttpMethod.GET},
                    authLevel = AuthorizationLevel.ANONYMOUS)
                    Foo foo,
                    ExecutionContext context) {
//        return handleRequest(foo, context);
        return new Bar("blah");
    }
}
