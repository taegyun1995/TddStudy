package com.example.blog;

import lombok.Value;

@Value(staticConstructor = "of")
public class BlogPostResponse {

    private String badWords;

}