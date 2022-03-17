package com.bits.dda.rest.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class UserResource {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;


}
