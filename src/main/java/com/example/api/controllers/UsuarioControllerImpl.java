package com.example.api.controllers;

import com.example.api.dto.UsuarioDTO;
import com.example.api.entities.Usuario;
import com.example.api.services.UsuarioServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/usuario")
public class UsuarioControllerImpl
        extends BaseControllerImpl<Usuario, UsuarioDTO, UsuarioServiceImpl>
        implements UsuarioController {
}
