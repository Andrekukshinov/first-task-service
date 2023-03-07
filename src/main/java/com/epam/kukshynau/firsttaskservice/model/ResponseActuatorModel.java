package com.epam.kukshynau.firsttaskservice.model;


public record ResponseActuatorModel(Integer responseCode, Boolean isConnected, String responseStatus) {
}
