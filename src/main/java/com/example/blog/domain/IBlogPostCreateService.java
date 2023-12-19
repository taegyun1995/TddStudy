package com.example.blog.domain;

public interface IBlogPostCreateService {

    BlogPost create(BlogPostCreateCommand command);

}