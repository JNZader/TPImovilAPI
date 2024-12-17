package com.example.api.repositories;

import com.example.api.entities.Post;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends BaseRepository<Post,Long>{
}
