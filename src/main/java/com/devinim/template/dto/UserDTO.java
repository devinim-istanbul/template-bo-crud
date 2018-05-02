package com.devinim.template.dto;

import lombok.Data;

@Data
public class UserDTO {

    private String name;
    private String email;

    private String firstName;
    private String lastName;

    public UserDTO() {
    }

    public UserDTO(String name, String email, String firstName, String lastName) {

        this.name = name;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
