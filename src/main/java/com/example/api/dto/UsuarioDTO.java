package com.example.api.dto;

import jakarta.validation.constraints.Email;
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
public class UsuarioDTO extends BaseDTO{
    @NotBlank
    @Size(min = 3, max = 50)
    private String nombre;
    @Email
    @NotBlank
    private String email;
    @NotBlank
    private String redSocial;
    @NotNull
    private ImagenDTO fotoPerfil;

}
