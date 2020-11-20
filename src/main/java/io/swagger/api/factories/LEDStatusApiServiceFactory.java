package io.swagger.api.factories;

import io.swagger.api.LEDStatusApiService;
import io.swagger.api.impl.LEDStatusApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-11-20T16:44:04.569Z[GMT]")public class LEDStatusApiServiceFactory {
    private final static LEDStatusApiService service = new LEDStatusApiServiceImpl();

    public static LEDStatusApiService getLEDStatusApi() {
        return service;
    }
}
