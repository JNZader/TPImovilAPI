package com.example.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.Set;

public class ImagenDTO extends BaseDTO{
    @NotBlank
    @Size(max = 255)
    private String url;

    @NotBlank
    @Size(max = 255)
    private String descripcion;

    @NotNull
    private Set<PostDTO> postImagen;

}
