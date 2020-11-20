package io.swagger.api.factories;

import io.swagger.api.SendTempApiService;
import io.swagger.api.impl.SendTempApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-11-20T16:44:04.569Z[GMT]")public class SendTempApiServiceFactory {
    private final static SendTempApiService service = new SendTempApiServiceImpl();

    public static SendTempApiService getSendTempApi() {
        return service;
    }
}
