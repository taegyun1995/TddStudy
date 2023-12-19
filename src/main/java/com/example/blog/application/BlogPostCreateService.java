package com.example.blog.application;

import com.example.blog.domain.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BlogPostCreateService implements IBlogPostCreateService {

    private final IBlogPostRepository repository;

    @Override
    public BlogPost create(BlogPostCreateCommand command) {
        repository.save(BlogPost.of(command.getId(), new Title(command.getTitle()), new Content(command.getContent())));
        return null;
    }

}