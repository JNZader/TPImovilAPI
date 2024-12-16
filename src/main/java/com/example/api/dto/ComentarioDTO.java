package com.example.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
public class ComentarioDTO extends BaseDTO {
    @NotBlank
    @Size(max = 255)
    private String texto;

    @NotNull
    private PostDTO post;

    @NotNull
    private UsuarioDTO usuario;
}

