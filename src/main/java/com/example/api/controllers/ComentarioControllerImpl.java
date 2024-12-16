package com.example.api.controllers;

import com.example.api.dto.ComentarioDTO;
import com.example.api.entities.Comentario;
import com.example.api.services.ComentarioServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/comentario")
public class ComentarioControllerImpl
        extends BaseControllerImpl<Comentario, ComentarioDTO, ComentarioServiceImpl>
        implements ComentarioController {
}
