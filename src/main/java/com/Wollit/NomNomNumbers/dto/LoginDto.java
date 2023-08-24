package com.Wollit.NomNomNumbers.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginDto {

    @NotBlank
    private String username;

    @NotBlank
    private String password;
}
