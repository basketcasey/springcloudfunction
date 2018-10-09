package com.ford.devenablement;

//import com.microsoft.azure.functions.ExecutionContext;

import com.microsoft.azure.functions.HttpMethod;
import com.microsoft.azure.functions.annotation.AuthorizationLevel;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.HttpTrigger;
import com.microsoft.azure.serverless.functions.ExecutionContext;
import org.springframework.cloud.function.adapter.azure.AzureSpringBootRequestHandler;

public class MyHandler extends AzureSpringBootRequestHandler<String, String> {
    @FunctionName("reverseString")
    public String execute(
            @HttpTrigger(name = "req", methods = { HttpMethod.GET, HttpMethod.POST},
                     authLevel = AuthorizationLevel.ANONYMOUS)
                    String s,
                    ExecutionContext context) {
        return handleRequest(s, context);
    }
}
