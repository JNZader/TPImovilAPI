package com.example.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
public class PostDTO extends BaseDTO{
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
