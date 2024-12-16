package com.example.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.Set;

public class PostDTO {
    @NotBlank
    @Size(max = 100)
    private String titulo;

    @NotBlank
    @Size(max = 255)
    private String descripcion;

    @NotBlank
    @Size(max = 50)
    private String categoria;

    @NotNull
    private Integer duracion;

    @NotNull
    private Double presupuesto;

    @NotNull
    private UsuarioDTO usuario;

    @NotNull
    private Set<ComentarioDTO> postComentarios;

    @NotNull
    private Set<ImagenDTO> postImagenes;
}
