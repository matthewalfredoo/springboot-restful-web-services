package com.example.springboot.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Schema(
        description = "UserDto Model Infomration"
)
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long id;

    @Schema(
            description = "User First Name"
    )
    @NotEmpty(message = "First name is required")
    private String firstName;

    @Schema(
            description = "User Last Name"
    )
    @NotEmpty(message = "Last name is required")
    private String lastName;

    @Schema(
            description = "User Email Address"
    )
    @NotEmpty(message = "Email is required")
    @Email(message = "Email is invalid")
    private String email;

}
