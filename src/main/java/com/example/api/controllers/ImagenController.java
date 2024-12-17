package com.example.api.controllers;

import com.example.api.dto.ImagenDTO;
import com.example.api.entities.Imagen;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface ImagenController extends BaseController<Imagen, ImagenDTO,Long>{

    ResponseEntity<Imagen> subirImagen(MultipartFile file) throws IOException;

    ResponseEntity<Void> borrarImagen(String imagenId) throws IOException;
}
