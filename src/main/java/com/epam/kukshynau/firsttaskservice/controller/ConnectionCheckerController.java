package com.epam.kukshynau.firsttaskservice.controller;

import com.epam.kukshynau.firsttaskservice.model.ResponseActuatorModel;
import java.io.IOException;
import java.net.URL;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "connection", enableByDefault = true)
public class ConnectionCheckerController {

    private static final String GOOGLE_COM = "https://www.google.com/";

    @ReadOperation
    public ResponseActuatorModel getConnection() {
        try {
            URL url = new URL(GOOGLE_COM);
            url.openConnection();
            return new ResponseActuatorModel(200, true, "connection is up");
        } catch (IOException e) {
            return new ResponseActuatorModel(500, false, "connection is down");
        }
    }

}
