package com.example.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class ComentarioDTO {
    @NotBlank
    @Size(max = 255)
    private String texto;

    @NotNull
    private PostDTO post;

    @NotNull
    private UsuarioDTO usuario;
}

