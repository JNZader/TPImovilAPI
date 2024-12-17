package com.example.api.services;

import com.example.api.dto.ImagenDTO;
import com.example.api.entities.Imagen;
import com.example.api.mappers.GenericMapper;
import com.example.api.repositories.BaseRepository;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

@Service
public class ImagenServiceImpl extends BaseServiceImpl<Imagen, ImagenDTO,Long> implements ImagenService {

    @Autowired
    private CloudinaryService cloudinaryService;

    /**
     * Constructor que inicializa el repositorio base, el mapeador y el EntityManager.
     *
     * @param baseRepository el repositorio base utilizado para realizar operaciones CRUD
     * @param mapper         el mapeador que convierte entre entidades y DTOs
     * @param entityManager  el EntityManager para realizar operaciones de persistencia
     */
    protected ImagenServiceImpl(
            BaseRepository<Imagen, Long> baseRepository,
            GenericMapper<Imagen, ImagenDTO> mapper,
            EntityManager entityManager) {
        super(baseRepository, mapper, entityManager);
    }

    @Override
    public Imagen subirImagen(MultipartFile file) throws IOException {
        Map uploadResult=cloudinaryService.upload(file);
        Imagen imagen=new Imagen();
        imagen.setName(file.getOriginalFilename());
        imagen.setImageUrl((String) uploadResult.get("url"));
        imagen.setImageId((String) uploadResult.get("public_id"));
        return baseRepository.save(imagen);
    }

    @Override
    public void borrarImagen(Imagen imagen) throws IOException {
        cloudinaryService.delete(imagen.getImageId());
        baseRepository.delete(imagen);
    }
}
