package com.example.api.services;

import com.example.api.dto.ComentarioDTO;
import com.example.api.entities.Comentario;
import com.example.api.mappers.GenericMapper;
import com.example.api.repositories.BaseRepository;
import jakarta.persistence.EntityManager;

public class ComentarioServiceImpl extends BaseServiceImpl<Comentario, ComentarioDTO, Long> implements ComentarioService {
    /**
     * Constructor que inicializa el repositorio base, el mapeador y el EntityManager.
     *
     * @param baseRepository el repositorio base utilizado para realizar operaciones CRUD
     * @param mapper         el mapeador que convierte entre entidades y DTOs
     * @param entityManager  el EntityManager para realizar operaciones de persistencia
     */
    protected ComentarioServiceImpl(
            BaseRepository<Comentario, Long> baseRepository,
            GenericMapper<Comentario, ComentarioDTO> mapper,
            EntityManager entityManager) {
        super(baseRepository, mapper, entityManager);
    }
}
