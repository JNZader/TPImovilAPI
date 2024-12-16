package com.example.api.controllers;

import com.example.api.dto.ImagenDTO;
import com.example.api.entities.Imagen;
import com.example.api.services.ImagenServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/imagen")
public class ImagenControllerImpl
        extends BaseControllerImpl<Imagen, ImagenDTO, ImagenServiceImpl>
        implements ImagenController {
}
