package com.Wollit.NomNomNumbers.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MessageResponseDto {

    @NotBlank
    private String message;
    private Object body;

    public MessageResponseDto(String message) {
        this.message = message;
    }
}
