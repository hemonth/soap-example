package com.hemonth.soapexample.endpoint;

import com.hemonth.soapexample.GetUserRequest;
import com.hemonth.soapexample.GetUserResponse;
import com.hemonth.soapexample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;

public class UserEndpoint {

    @Autowired
    private UserService userService;

    @PayloadRoot(namespace = "http://hemonth.com/soap-example", localPart = "getUserRequest")
    public GetUserResponse getUserRequest(@RequestPayload GetUserRequest userRequest){
        GetUserResponse userResponse = new GetUserResponse();
        userResponse.setUser(userService.gerUser(userRequest.getName()));
        return userResponse;
    }
}
