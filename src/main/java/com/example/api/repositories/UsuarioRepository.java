package com.example.api.repositories;

import com.example.api.entities.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends BaseRepository<Usuario,Long>{
}
