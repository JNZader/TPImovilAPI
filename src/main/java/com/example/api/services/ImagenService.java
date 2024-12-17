package com.example.api.services;

import com.example.api.dto.ImagenDTO;
import com.example.api.entities.Imagen;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface ImagenService extends BaseService<Imagen, ImagenDTO,Long>{
    Imagen subirImagen(MultipartFile file) throws IOException;

    void borrarImagen(Imagen imagen) throws IOException;
}
