package com.example.api.controllers;

import com.example.api.dto.PostDTO;
import com.example.api.entities.Post;
import com.example.api.services.PostServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/post")
public class PostControllerImpl
        extends BaseControllerImpl<Post, PostDTO, PostServiceImpl>
        implements PostController {
}
