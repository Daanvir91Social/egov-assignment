package org.service.api;

import org.service.model.ErrorRes;
import org.service.model.ServiceDefinitionRequest;
import org.service.model.ServiceDefinitionResponse;
import org.service.model.ServiceDefinitionSearchRequest;
import org.service.model.ServiceRequest;
import org.service.model.ServiceResponse;
import org.service.model.ServiceSearchRequest;


import org.service.service.ServiceApiDelegateImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import javax.annotation.Generated;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import io.swagger.annotations.*;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-07-23T22:54:35.857770+05:30[Asia/Kolkata]")
@RestController
public class ServiceApiController implements ServiceApi {

    @Autowired
    private ServiceApiDelegateImpl serviceApiDelegateImpl;
    private final ServiceApiDelegate delegate;

    public ServiceApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) ServiceApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ServiceApiDelegate() {});
    }

    /**
     * POST /service/definition/v1/_create
     *
     * @param serviceDefinitionRequest  (optional)
     * @return Request accepted. (status code 202)
     *         or Invalid input. (status code 400)
     */
    @ApiOperation(value = "", nickname = "serviceDefinitionV1CreatePost", notes = "", response = ServiceDefinitionResponse.class, tags={ "Service Definition", })
    @ApiResponses(value = {
            @ApiResponse(code = 202, message = "Request accepted.", response = ServiceDefinitionResponse.class),
            @ApiResponse(code = 400, message = "Invalid input.", response = ErrorRes.class) })
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/service/definition/v1/_create",
            produces = MediaType.APPLICATION_JSON_VALUE,//{ "*/*" },
            consumes = { "application/json" }
    )
    @Override
    public ResponseEntity<ServiceDefinitionResponse> serviceDefinitionV1CreatePost(ServiceDefinitionRequest serviceDefinitionRequest) {
        return serviceApiDelegateImpl.serviceDefinitionV1CreatePost(serviceDefinitionRequest);
    }

    /**
     * POST /service/definition/v1/_search
     *
     * @param serviceDefinitionSearchRequest  (optional)
     * @return Request accepted. (status code 202)
     *         or Invalid input. (status code 400)
     */
    @ApiOperation(value = "", nickname = "serviceDefinitionV1SearchPost", notes = "", response = ServiceDefinitionResponse.class, tags={ "Service Definition", })
    @ApiResponses(value = {
            @ApiResponse(code = 202, message = "Request accepted.", response = ServiceDefinitionResponse.class),
            @ApiResponse(code = 400, message = "Invalid input.", response = ErrorRes.class) })
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/service/definition/v1/_search",
            produces = MediaType.APPLICATION_JSON_VALUE,//{ "*/*" },
            consumes = { "application/json" }
    )
    @Override
    public ResponseEntity<ServiceDefinitionResponse> serviceDefinitionV1SearchPost(ServiceDefinitionSearchRequest serviceDefinitionSearchRequest) {
        return serviceApiDelegateImpl.serviceDefinitionV1SearchPost(serviceDefinitionSearchRequest);
    }

    /**
     * POST /service/v1/_create
     *
     * @param serviceRequest  (optional)
     * @return Request accepted. (status code 202)
     *         or Invalid input. (status code 400)
     */
    @ApiOperation(value = "", nickname = "serviceV1CreatePost", notes = "", response = ServiceResponse.class, tags={ "Service", })
    @ApiResponses(value = {
            @ApiResponse(code = 202, message = "Request accepted.", response = ServiceResponse.class),
            @ApiResponse(code = 400, message = "Invalid input.", response = ErrorRes.class) })
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/service/v1/_create",
            produces = MediaType.APPLICATION_JSON_VALUE,//{ "*/*" },
            consumes = { "application/json" }
    )
    @Override
    public ResponseEntity<ServiceResponse> serviceV1CreatePost(ServiceRequest serviceRequest) {
        return serviceApiDelegateImpl.serviceV1CreatePost(serviceRequest);
    }

    /**
     * POST /service/v1/_search
     *
     * @param serviceSearchRequest  (optional)
     * @return Request accepted. (status code 202)
     *         or Invalid input. (status code 400)
     */
    @ApiOperation(value = "", nickname = "serviceV1SearchPost", notes = "", response = ServiceResponse.class, tags={ "Service", })
    @ApiResponses(value = {
            @ApiResponse(code = 202, message = "Request accepted.", response = ServiceResponse.class),
            @ApiResponse(code = 400, message = "Invalid input.", response = ErrorRes.class) })
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/service/v1/_search",
            produces = MediaType.APPLICATION_JSON_VALUE,//{ "*/*" },
            consumes = { "application/json" }
    )
    @Override
    public ResponseEntity<ServiceResponse> serviceV1SearchPost(ServiceSearchRequest serviceSearchRequest) {
        return serviceApiDelegateImpl.serviceV1SearchPost(serviceSearchRequest);
    }

    @Override
    public ServiceApiDelegate getDelegate() {
        return delegate;
    }

}
