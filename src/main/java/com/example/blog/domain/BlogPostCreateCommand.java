package com.example.blog.domain;

import lombok.Value;

@Value(staticConstructor = "of")
public class BlogPostCreateCommand {

    Long id;
    String title;
    String content;

}