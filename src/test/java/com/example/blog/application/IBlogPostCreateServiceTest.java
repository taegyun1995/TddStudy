package com.example.blog.application;

import com.example.blog.domain.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class IBlogPostCreateServiceTest {

    IBlogPostCreateService sut;

    @BeforeEach
    void setUp() {
        sut = new IBlogPostCreateService() {
            @Override
            public BlogPost create(BlogPostCreateCommand command) {
                return BlogPost.of(command.getId(), new Title(command.getTitle()), new Content(command.getContent()));
            }
        };
    }

    @Test
    void name() {
        var actual = sut.create(BlogPostCreateCommand.of(1l, "title", "content"));

        assertNotNull(actual);
        assertThat(actual.getTitle()).isEqualTo("title");
        assertThat(actual.getContent()).isEqualTo("content");
    }
}