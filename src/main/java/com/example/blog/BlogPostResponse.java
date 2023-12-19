package com.example.blog;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BlogPostResponse {

    private String badWords;

    public BlogPostResponse(String badWords) {
        this.badWords = badWords;
    }

}