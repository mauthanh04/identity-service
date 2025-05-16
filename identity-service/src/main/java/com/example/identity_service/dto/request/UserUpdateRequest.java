package com.example.identity_service.dto.request;

import java.time.LocalDate;
import java.util.Set;

import jakarta.validation.constraints.Size;

import com.example.identity_service.Validator.DobConstraint;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserUpdateRequest {
    @Size(min = 8, message = "INVALID_PASSWORD")
    private String password;

    private String firstName;
    private String lastName;

    @DobConstraint(min = 18, message = "INVALID_DOB")
    private LocalDate dob;

    Set<String> roles;
}
