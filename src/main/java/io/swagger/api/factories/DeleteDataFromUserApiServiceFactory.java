package io.swagger.api.factories;

import io.swagger.api.DeleteDataFromUserApiService;
import io.swagger.api.impl.DeleteDataFromUserApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-11-20T16:44:04.569Z[GMT]")public class DeleteDataFromUserApiServiceFactory {
    private final static DeleteDataFromUserApiService service = new DeleteDataFromUserApiServiceImpl();

    public static DeleteDataFromUserApiService getDeleteDataFromUserApi() {
        return service;
    }
}
