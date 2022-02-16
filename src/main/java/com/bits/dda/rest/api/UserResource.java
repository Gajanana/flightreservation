package com.bits.dda.rest.api;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class UserResource {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;


}
