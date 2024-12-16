package com.example.api.services;

import com.example.api.dto.UsuarioDTO;
import com.example.api.entities.Usuario;
import com.example.api.mappers.GenericMapper;
import com.example.api.repositories.BaseRepository;
import jakarta.persistence.EntityManager;

public class UsuarioServiceImpl extends BaseServiceImpl<Usuario, UsuarioDTO,Long>implements UsuarioService {
    /**
     * Constructor que inicializa el repositorio base, el mapeador y el EntityManager.
     *
     * @param baseRepository el repositorio base utilizado para realizar operaciones CRUD
     * @param mapper         el mapeador que convierte entre entidades y DTOs
     * @param entityManager  el EntityManager para realizar operaciones de persistencia
     */
    protected UsuarioServiceImpl(
            BaseRepository<Usuario, Long> baseRepository,
            GenericMapper<Usuario, UsuarioDTO> mapper,
            EntityManager entityManager) {
        super(baseRepository, mapper, entityManager);
    }
}
