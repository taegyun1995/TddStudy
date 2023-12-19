package com.example.blog.application;

import com.example.blog.domain.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class BlogPostCreateServiceTest {

    IBlogPostRepository repositoryMock;
    BlogPostCreateService sut;

    @BeforeEach
    void setUp() {
        repositoryMock = mock(IBlogPostRepository.class);
        sut = new BlogPostCreateService(repositoryMock);
    }

    @Test
    void name() {
        sut.create(BlogPostCreateCommand.of(1l, "title", "content"));

        verify(repositoryMock).save(BlogPost.of(1l, new Title("title"), new Content("content")));
    }

}