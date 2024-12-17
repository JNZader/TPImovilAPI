package com.example.api.controllers;

import com.example.api.dto.ImagenDTO;
import com.example.api.entities.Imagen;
import com.example.api.services.ImagenServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping(path = "api/v1/imagen")
public class ImagenControllerImpl
        extends BaseControllerImpl<Imagen, ImagenDTO, ImagenServiceImpl>
        implements ImagenController {

    @Override
    @PostMapping("/subir")
    public ResponseEntity<Imagen> subirImagen(@RequestParam("file") MultipartFile file) throws IOException {
        Imagen imagen = servicio.subirImagen(file);
        return ResponseEntity.ok(imagen);
    }

    @Override
    @DeleteMapping("/borrar/{imagenId}")
    public ResponseEntity<Void> borrarImagen(@PathVariable String imagenId) throws IOException {
        servicio.borrarImagen(new Imagen(imagenId, null, null, null)); // Assuming imageId is the public_id
        return ResponseEntity.noContent().build();
    }
}
