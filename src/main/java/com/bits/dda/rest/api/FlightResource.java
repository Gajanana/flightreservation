package com.bits.dda.rest.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;


@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class FlightResource {

    private Long flightCode;
    private String operator;
    private String model;
    private String email;


}