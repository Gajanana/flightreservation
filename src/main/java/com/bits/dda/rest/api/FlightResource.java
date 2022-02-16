package com.bits.dda.rest.api;

import lombok.Data;


@Data
public class FlightResource {

    private Long flightCode;
    private String operator;
    private String model;
    private String email;


}