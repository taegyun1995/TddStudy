package com.example.blog.domain;

import lombok.*;

@Value(staticConstructor = "of")
public class BlogPost {

    Long id;
    Title title;
    Content content;

    public String extractBadWords() {
        return title.extractBadWords();
    }

}