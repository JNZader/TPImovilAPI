package com.example.api.services;

import com.example.api.dto.ImagenDTO;
import com.example.api.entities.Imagen;
import com.example.api.mappers.GenericMapper;
import com.example.api.repositories.BaseRepository;
import jakarta.persistence.EntityManager;

public class ImagenServiceImpl extends BaseServiceImpl<Imagen, ImagenDTO,Long> implements ImagenService {
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
}
