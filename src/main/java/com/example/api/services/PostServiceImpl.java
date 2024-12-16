package com.example.api.services;

import com.example.api.dto.PostDTO;
import com.example.api.entities.Post;
import com.example.api.mappers.GenericMapper;
import com.example.api.repositories.BaseRepository;
import jakarta.persistence.EntityManager;

public class PostServiceImpl extends BaseServiceImpl<Post, PostDTO,Long> implements PostService {
    /**
     * Constructor que inicializa el repositorio base, el mapeador y el EntityManager.
     *
     * @param baseRepository el repositorio base utilizado para realizar operaciones CRUD
     * @param mapper         el mapeador que convierte entre entidades y DTOs
     * @param entityManager  el EntityManager para realizar operaciones de persistencia
     */
    protected PostServiceImpl(
            BaseRepository<Post, Long> baseRepository,
            GenericMapper<Post, PostDTO> mapper,
            EntityManager entityManager) {
        super(baseRepository, mapper, entityManager);
    }
}
