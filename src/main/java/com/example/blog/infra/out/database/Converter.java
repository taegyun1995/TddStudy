package com.example.blog.infra.out.database;

import com.example.blog.domain.BlogPost;

public class Converter {

    public static BlogPostEntity toEntity(BlogPost blogPost) {
        return BlogPostEntity.of(blogPost.getId(), blogPost.getTitle().getTitle(), blogPost.getContent().getContent());
    }

}