package com.example.blog;

import lombok.Value;

@Value(staticConstructor = "of")
public class BlogRequest {

    Long id;
    String title;
    String content;

}